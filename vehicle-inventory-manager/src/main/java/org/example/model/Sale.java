package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    private Long id;

    private Long carId;
    private Long customerId;

    private LocalDateTime saleDate;

    private Double carCostPrice;
    private Double actualSalePrice;
    private Double discountApplied;
    private String paymentMethod;

    private String saleNotes;
}
