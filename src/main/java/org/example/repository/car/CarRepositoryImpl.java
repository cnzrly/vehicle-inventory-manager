package org.example.repository.car;

import org.example.config.DatabaseConfig;
import org.example.enums.*;
import org.example.exception.DatabaseException;
import org.example.exception.NotFoundException;
import org.example.model.Car;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.util.CarSqlConstants.*;

public class CarRepositoryImpl implements CarRepository {

    private final DatabaseConfig databaseConfig;


    public CarRepositoryImpl(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    private Car mapResultSetToCar(ResultSet rs) throws SQLException {

        return Car.builder()
                .id(rs.getLong("id"))
                .brand(CarBrand.valueOf(rs.getString("brand")))
                .model(CarModel.valueOf(rs.getString("model")))
                .year(rs.getInt("year"))
                .transmissionType(TransmissionType.valueOf(rs.getString("transmissionType")))
                .fuelType(FuelType.valueOf(rs.getString("fuelType")))
                .color(rs.getString("color"))
                .kilometersDriven(rs.getDouble("kilometersDriven"))
                .price(rs.getDouble("price"))
                .costPrice(rs.getDouble("costPrice"))
                .saleStatus(SaleStatus.valueOf(rs.getString("saleStatus")))
                .build();
    }

    private int setCarParameters(PreparedStatement ps, Car car) throws SQLException {
        ps.setString(1, car.getBrand().name());
        ps.setString(2, car.getModel().name());
        ps.setInt(3, car.getYear());
        ps.setString(4, car.getTransmissionType().name());
        ps.setString(5, car.getFuelType().name());
        ps.setString(6, car.getColor());
        ps.setDouble(7, car.getKilometersDriven());
        ps.setDouble(8, car.getPrice());
        ps.setDouble(9, car.getCostPrice());
        ps.setString(10, car.getSaleStatus().name());
        return 11;
    }



    @Override
    public Car save(Car car) {
        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_SQL)) {

            setCarParameters(ps, car);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToCar(rs);
                } else {
                    throw new DatabaseException("Failed to save car, no data returned.");
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error saving car: " + e.getMessage());
        }
    }

    @Override
    public Optional<Car> findById(Long id) {
        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(FIND_BY_ID_SQL)) {

            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToCar(rs));
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding car by ID: " + id + ". Error: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        try (Connection conn = databaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(FIND_ALL_SQL)) {

            while (rs.next()) {
                cars.add(mapResultSetToCar(rs));
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding all cars: " + e.getMessage());
        }
        return cars;
    }

    @Override
    public Car update(Car car) {
        if (car.getId() == null) {
            throw new DatabaseException("Cannot update car: ID is required.");
        }

        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(UPDATE_SQL)) {

            int nextParamIndex = setCarParameters(ps, car);
            ps.setLong(nextParamIndex, car.getId());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToCar(rs);
                } else {
                    throw new NotFoundException("Car not found with ID: " + car.getId() + " for update.");
                }
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error updating car: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Connection conn = databaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(DELETE_SQL)) {

            ps.setLong(1, id);
            int affectedRows = ps.executeUpdate();

            if (affectedRows == 0) {
                throw new NotFoundException("Car not found with ID: " + id + " for deletion.");
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error deleting car with ID: " + id + ". Error: " + e.getMessage());
        }
    }
}