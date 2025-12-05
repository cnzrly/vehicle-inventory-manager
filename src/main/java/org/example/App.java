package org.example;

import org.example.config.DatabaseConfig;
import org.example.enums.*;
import org.example.exception.NotFoundException;
import org.example.model.Car;
import org.example.repository.car.CarRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car testCar = Car.builder()
                .brand(CarBrand.BMW) // BMW
                .model(CarModel.SERIES_3) // SERIES_3
                .year(2020)
                .transmissionType(TransmissionType.AUTOMATIC) // AUTOMATIC
                .fuelType(FuelType.PETROL) // PETROL
                .color("Black")
                .kilometersDriven(50000.0)
                .price(35000.0)
                .costPrice(30000.0)
                .saleStatus(SaleStatus.IN_STOCK) // IN_STOCK
                .build();
    }
}
