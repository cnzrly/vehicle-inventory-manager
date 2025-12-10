package org.example.mapper;

import org.example.dto.car.CarAdminResponseDto;
import org.example.dto.car.CarPublicResponseDto;
import org.example.dto.car.CarRequestDto;
import org.example.model.Car;

public class CarMapper {
    static Car toEntity(CarRequestDto carRequestDto) {
        if (carRequestDto == null) {
            return null;
        }
        return Car.builder()
                .brand(carRequestDto.getBrand())
                .model(carRequestDto.getModel())
                .year(carRequestDto.getYear())
                .transmissionType(carRequestDto.getTransmissionType())
                .fuelType(carRequestDto.getFuelType())
                .color(carRequestDto.getColor())
                .kilometersDriven(carRequestDto.getKilometersDriven())
                .price(carRequestDto.getPrice())
                .costPrice(carRequestDto.getCostPrice())
                .build();
    }

    public static CarAdminResponseDto toAdminDto(Car car) {
        if (car == null) {
            return null;
        }
        return CarAdminResponseDto.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .year(car.getYear())
                .transmissionType(car.getTransmissionType())
                .fuelType(car.getFuelType())
                .color(car.getColor())
                .kilometersDriven(car.getKilometersDriven())
                .price(car.getPrice())
                .costPrice(car.getCostPrice())
                .saleStatus(car.getSaleStatus())
                .build();
    }

    public static CarPublicResponseDto toPublicDto(Car car) {
        if (car == null) {
            return null;
        }
        return CarPublicResponseDto.builder()
                .brand(car.getBrand())
                .model(car.getModel())
                .year(car.getYear())
                .transmissionType(car.getTransmissionType())
                .fuelType(car.getFuelType())
                .color(car.getColor())
                .kilometersDriven(car.getKilometersDriven())
                .price(car.getPrice())
                .saleStatus(car.getSaleStatus())
                .build();
    }
}
