
package org.example.repository.sale;

import org.example.config.DatabaseConfig;
import org.example.exception.DatabaseException;
import org.example.exception.NotFoundException;
import org.example.model.Sale;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.util.CarSqlConstants.*;

public class SaleRepositoryImpl implements SaleRepository {
    private final DatabaseConfig databaseConfig;

    public SaleRepositoryImpl(DatabaseConfig dataConfig) {
        this.databaseConfig = dataConfig;
    }

    private Sale mapResultSetToSale(ResultSet rs) throws SQLException {
        Timestamp timestamp = rs.getTimestamp("saleDate");
        LocalDateTime saleDateTime = null;
        if (timestamp != null) {
            saleDateTime = rs.getTimestamp("saleDate").toLocalDateTime();
        }
        return Sale.builder()
                .id(rs.getLong("id"))
                .carId(rs.getLong("carId"))
                .customerId(rs.getLong("customerId"))
                .saleDate(saleDateTime)
                .carCostPrice(rs.getDouble("carCostPrice"))
                .actualSalePrice(rs.getDouble("actualSalePrice"))
                .discountApplied(rs.getDouble("discountApplied"))
                .paymentMethod(rs.getString("paymentMethod"))
                .saleNotes(rs.getString("saleNotes"))
                .build();
    }

    private int setSaleParameters(PreparedStatement ps, Sale sale) throws SQLException {
        ps.setLong(1, sale.getCarId());
        ps.setLong(2, sale.getCustomerId());
        ps.setTimestamp(3, Timestamp.valueOf(sale.getSaleDate()));
        ps.setDouble(4, sale.getCarCostPrice());
        ps.setDouble(5, sale.getActualSalePrice());
        ps.setDouble(6, sale.getDiscountApplied());
        ps.setString(7, sale.getPaymentMethod());
        ps.setString(8, sale.getSaleNotes());
        return 9;
    }

    @Override
    public Sale save(Sale sale) {

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_SQL_SALE)) {
            setSaleParameters(ps, sale);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToSale(rs);
                } else {
                    throw new DatabaseException("Failed to save sale, no data returned.");
                }
            }
        } catch (SQLException e) {

            throw new DatabaseException("Error saving sale :" + e.getMessage());
        }
    }

    @Override
    public Optional<Sale> findById(Long id) {

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(FIND_BY_ID_SQL_SALE)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToSale(rs));
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding sale by ID: " + id + ". Error:" + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<Sale> findAll() {

        List<Sale> sales = new ArrayList<>();
        try (Connection conn = databaseConfig.getConnection();
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(FIND_ALL_SQL_SALE);
            while (rs.next()) {
                sales.add(mapResultSetToSale(rs));
            }

        } catch (SQLException e) {
            throw new DatabaseException("Error finding all sales." + e.getMessage());
        }
        return sales;
    }

    @Override
    public Sale update(Sale sale) {
        if (sale.getId() == null) {
            throw new DatabaseException("Cannot update sale: ID is required.");
        }

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(UPDATE_SQL_SALE)) {
            int nextIndex = setSaleParameters(ps, sale);
            ps.setLong(nextIndex, sale.getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToSale(rs);
                } else {

                    throw new NotFoundException("Sale not found with ID: " + sale.getId() + " for update.");
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error updating sale: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(DELETE_SQL_SALE)) {
            ps.setLong(1, id);
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0) {

                throw new NotFoundException("No sale found with ID: " + id + " to delete.");
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error deleting sale by ID: " + id + ". Error:" + e.getMessage());
        }
    }
}