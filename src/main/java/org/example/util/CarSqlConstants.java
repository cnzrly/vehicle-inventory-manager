// DÜZELTİLMİŞ CarSqlConstants.java
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

    // Düzeltildi: driverLicenseNumber, UPDATE tablo adı, DELETE tablo adı
    String ALL_COLUMNS_CUSTOMER = "id, firstName, lastName, phoneNumber, secondaryPhoneNumber, email, city, zipCode, address, dateOfBirth, driverLicenseNumber";
    String INSERT_SQL_CUSTOMER = String.format(
            "INSERT INTO customers (firstName, lastName, phoneNumber, secondaryPhoneNumber, email, city, zipCode, address, dateOfBirth, driverLicenseNumber) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING %s", ALL_COLUMNS_CUSTOMER
    );
    String FIND_BY_ID_SQL_CUSTOMER = String.format(
            "SELECT %s FROM customers WHERE id = ?", ALL_COLUMNS_CUSTOMER
    );
    String FIND_ALL_SQL_CUSTOMER = String.format(
            "SELECT %s FROM customers", ALL_COLUMNS_CUSTOMER
    );
    String UPDATE_SQL_CUSTOMER = String.format(
            "UPDATE customers SET firstName=?, lastName=?, phoneNumber=?, secondaryPhoneNumber=?, email=?, city=?, zipCode=?, address=?, dateOfBirth=?, driverLicenseNumber=? "
                    + "WHERE id = ? RETURNING %s", ALL_COLUMNS_CUSTOMER
    );
    String DELETE_SQL_CUSTOMER = "DELETE FROM customers WHERE id = ?";


    String ALL_COLUMNS_SALE = "id, carId, customerId, saleDate, carCostPrice, actualSalePrice, discountApplied, paymentMethod, saleNotes";
    String INSERT_SQL_SALE = String.format(
            "INSERT INTO sales (carId, customerId, saleDate, carCostPrice, actualSalePrice, discountApplied, paymentMethod, saleNotes) VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING %s", ALL_COLUMNS_SALE
    );
    String FIND_BY_ID_SQL_SALE = String.format(
            "SELECT %s FROM sales WHERE id = ?", ALL_COLUMNS_SALE
    );
    String FIND_ALL_SQL_SALE = String.format(
            "SELECT %s FROM sales", ALL_COLUMNS_SALE);
    String UPDATE_SQL_SALE = String.format(
            "UPDATE sales SET carId=?, customerId=?, saleDate=?, carCostPrice=?, actualSalePrice=?, discountApplied=?, paymentMethod=?, saleNotes=? "
                    + "WHERE id = ? RETURNING %s", ALL_COLUMNS_SALE
    );
    String DELETE_SQL_SALE = "DELETE FROM sales WHERE id = ?";
}