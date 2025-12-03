package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Long id;

    private CarBrand brand;
    private CarModel model;
    private Integer year;

    private TransmissionType transmissionType;
    private FuelType fuelType;
    private String color;
    private Double kilometersDriven;


    private Double price;
    private Double costPrice;

    private SaleStatus saleStatus;

}
