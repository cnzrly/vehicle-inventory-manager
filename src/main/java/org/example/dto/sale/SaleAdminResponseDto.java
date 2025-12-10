package org.example.dto.sale;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaleAdminResponseDto {
    private Long id;

    private Long carId;
    private Long customerId;

    private LocalDateTime saleDate;

    private Double carCostPrice;
    private Double actualSalePrice;
    private Double discountApplied;
    private String paymentMethod;
    private String saleNotes;

    private Double totalProfitWithoutDiscount;// (actualSalePrice - carCostPrice)
    private Double profitMarginPercentageWithoutDiscount; // ((totalProfitWithoutDiscount / carCostPrice) * 100)
    private Double discountPercentage;     // ((discountApplied / actualSalePrice) * 100)
    private Double finalPricePaid;  // (actualSalePrice - discountApplied)
    private Double finalTotalProfit;  // (finalPricePaid - carCostPrice))
    private Double finalTotalProfitMarginPercentage;// ((finalTotalProfit / carCostPrice) * 100)


}