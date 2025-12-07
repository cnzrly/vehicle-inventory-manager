package org.example.dto.sale;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaleResponseDto {
    private Long id;

    private Long carId;
    private Long customerId;

    private LocalDateTime saleDate;

    private Double carCostPrice;
    private Double actualSalePrice;
    private Double discountApplied;
    private String paymentMethod;
    private String saleNotes;

    private Double totalProfit;// (actualSalePrice - carCostPrice)
    private Double profitMarginPercentage; // ((totalProfit / carCostPrice) * 100)
}