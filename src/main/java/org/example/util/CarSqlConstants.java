package org.example.util;


public interface CarSqlConstants {

    String ALL_COLUMNS = "id, brand, model, year, transmissionType, fuelType, color, kilometersDriven, price, costPrice, saleStatus";
    String INSERT_SQL = String.format(
            "INSERT INTO cars (brand, model, year, transmissionType, fuelType, color, kilometersDriven, price, costPrice, saleStatus) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING %s", ALL_COLUMNS
    );
    String FIND_BY_ID_SQL = String.format(
            "SELECT %s FROM cars WHERE id = ?", ALL_COLUMNS
    );
    String FIND_ALL_SQL = String.format(
            "SELECT %s FROM cars", ALL_COLUMNS
    );
    String UPDATE_SQL = String.format(
            "UPDATE cars SET brand=?, model=?, year=?, transmissionType=?, fuelType=?, color=?, kilometersDriven=?, price=?, costPrice=?, saleStatus=? "
                    + "WHERE id = ? RETURNING %s", ALL_COLUMNS
    );
    String DELETE_SQL = "DELETE FROM cars WHERE id = ?";
}