package org.example.dto.car;

import org.example.enums.CarBrand;
import org.example.enums.CarModel;
import org.example.enums.FuelType;
import org.example.enums.TransmissionType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarRequestDto {

    private CarBrand brand;
    private CarModel model;
    private Integer year;

    private TransmissionType transmissionType;
    private FuelType fuelType;
    private String color;
    private Double kilometersDriven;

    private Double price;
    private Double costPrice;
}