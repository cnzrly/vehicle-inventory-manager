package org.example.dto.car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.*;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
