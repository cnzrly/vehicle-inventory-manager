package org.example.util;


public interface CarSqlConstants {

    String ALL_COLUMNS_CAR = "id, brand, model, year, transmissionType, fuelType, color, kilometersDriven, price, costPrice, saleStatus";
    String INSERT_SQL_CAR = String.format(
            "INSERT INTO cars (brand, model, year, transmissionType, fuelType, color, kilometersDriven, price, costPrice, saleStatus) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING %s", ALL_COLUMNS_CAR
    );
    String FIND_BY_ID_SQL_CAR = String.format(
            "SELECT %s FROM cars WHERE id = ?", ALL_COLUMNS_CAR
    );
    String FIND_ALL_SQL_CAR = String.format(
            "SELECT %s FROM cars", ALL_COLUMNS_CAR
    );
    String UPDATE_SQL_CAR = String.format(
            "UPDATE cars SET brand=?, model=?, year=?, transmissionType=?, fuelType=?, color=?, kilometersDriven=?, price=?, costPrice=?, saleStatus=? "
                    + "WHERE id = ? RETURNING %s", ALL_COLUMNS_CAR
    );
    String DELETE_SQL_CAR = "DELETE FROM cars WHERE id = ?";

    String ALL_COLUMNS_CUSTOMER = "id, firstName, lastName, phoneNumber, secondaryPhoneNumber, email, city, zipCode, address, dateOfBirth, drivenLicenseNumber";
    String INSERT_SQL_CUSTOMER = String.format(
            "INSERT INTO customers (firstName, lastName, phoneNumber, secondaryPhoneNumber, email, city, zipCode, address, dateOfBirth, drivenLicenseNumber) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING %s", ALL_COLUMNS_CUSTOMER
    );
    String FIND_BY_ID_SQL_CUSTOMER = String.format(
            "SELECT %s FROM customers WHERE id = ?", ALL_COLUMNS_CUSTOMER
    );
    String FIND_ALL_SQL_CUSTOMER = String.format(
            "SELECT %s FROM customers", ALL_COLUMNS_CUSTOMER
    );
    String UPDATE_SQL_CUSTOMER = String.format(
            "UPDATE cars SET firstName=?, lastName=?, phoneNumber=?, secondaryPhoneNumber=?, email=?, city=?, zipCode=?, address=?, dateOfBirth=?, drivenLicenseNumber=? "
                    + "WHERE id = ? RETURNING %s", ALL_COLUMNS_CUSTOMER
    );
    String DELETE_SQL_CUSTOMER = "DELETE FROM customer WHERE id = ?";
}