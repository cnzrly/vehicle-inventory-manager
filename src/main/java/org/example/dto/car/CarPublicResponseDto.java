package org.example.dto.car;

import lombok.Builder;
import lombok.Data;
import org.example.enums.*;
@Data
@Builder
public class CarPublicResponseDto {

    private CarBrand brand;
    private CarModel model;
    private Integer year;

    private TransmissionType transmissionType;
    private FuelType fuelType;
    private String color;
    private Double kilometersDriven;

    private Double price;

    private SaleStatus saleStatus;
}
