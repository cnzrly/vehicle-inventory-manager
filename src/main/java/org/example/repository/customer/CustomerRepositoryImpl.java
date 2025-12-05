
package org.example.repository.customer;

import org.example.config.DatabaseConfig;
import org.example.enums.City;
import org.example.exception.DatabaseException;
import org.example.exception.NotFoundException;
import org.example.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.util.CarSqlConstants.*;

public class CustomerRepositoryImpl implements CustomerRepository {
    private final DatabaseConfig databaseConfig;

    public CustomerRepositoryImpl(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    private Customer mapResultSetToCustomer(ResultSet rs) throws SQLException {

        return Customer.builder()
                .id(rs.getLong("id"))
                .firstName(rs.getString("firstName"))
                .lastName(rs.getString("lastName"))
                .phoneNumber(rs.getString("phoneNumber"))
                .secondaryPhoneNumber(rs.getString("secondaryPhoneNumber"))
                .email(rs.getString("email"))
                .city(City.valueOf(rs.getString("city")))
                .zipCode(City.valueOf(rs.getString("zipCode")))
                .address(rs.getString("address"))
                .dateOfBirth(rs.getDate("dateOfBirth").toLocalDate())
                .driverLicenseNumber(rs.getString("driverLicenseNumber"))
                .build();
    }

    private int setCustomerParameters(PreparedStatement ps, Customer customer) throws SQLException {

        ps.setString(1, customer.getFirstName());
        ps.setString(2, customer.getLastName());
        ps.setString(3, customer.getPhoneNumber());
        ps.setString(4, customer.getSecondaryPhoneNumber());
        ps.setString(5, customer.getEmail());
        ps.setString(6, customer.getCity().name());
        ps.setString(7, customer.getZipCode().name());
        ps.setString(8, customer.getAddress());
        ps.setDate(9, Date.valueOf(customer.getDateOfBirth()));
        ps.setString(10, customer.getDriverLicenseNumber());
        return 11;
    }

    @Override
    public Customer save(Customer customer) {

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_SQL_CUSTOMER)) {
            setCustomerParameters(ps, customer);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToCustomer(rs);
                } else {
                    throw new DatabaseException("Failed to save customer, no data returned.");
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error saving customer: " + e.getMessage());
        }
    }

    @Override
    public Optional<Customer> findById(Long id) {

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(FIND_BY_ID_SQL_CUSTOMER)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToCustomer(rs));
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding customer by ID: " + id + ". Error:" + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();
        try (Connection conn = databaseConfig.getConnection();
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(FIND_ALL_SQL_CUSTOMER);
            while (rs.next()) {
                customers.add(mapResultSetToCustomer(rs));
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding all customers: " + e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer update(Customer customer) {
        if (customer.getId() == null) {
            throw new DatabaseException("Cannot update customer: ID is required.");
        }

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(UPDATE_SQL_CUSTOMER)) {
            int nextIndex = setCustomerParameters(ps, customer);
            ps.setLong(nextIndex, customer.getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToCustomer(rs);
                } else {

                    throw new NotFoundException("Customer not found with ID: " + customer.getId() + " for update.");
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error updating customer: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Long id) {

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(DELETE_SQL_CUSTOMER)) {
            ps.setLong(1, id);
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0) {

                throw new NotFoundException("No customer found with ID: " + id + " to delete.");
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error deleting customer with ID: " + id + ". Error: " + e.getMessage());
        }

    }
}