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

    public Double getTotalProfitWithoutDiscount() {
        if (actualSalePrice == null || carCostPrice == null) return 0.0;
        return actualSalePrice - carCostPrice;
    }


    public Double getProfitMarginPercentageWithoutDiscount() {
        if (carCostPrice == null || carCostPrice == 0) return 0.0;
        return (getTotalProfitWithoutDiscount() / carCostPrice) * 100;
    }


    public Double getDiscountPercentage() {
        if (actualSalePrice == null || actualSalePrice == 0 || discountApplied == null) return 0.0;
        return (discountApplied / actualSalePrice) * 100;
    }


    public Double getFinalPricePaid() {
        if (actualSalePrice == null) return 0.0;
        double discount = (discountApplied != null) ? discountApplied : 0.0;
        return actualSalePrice - discount;
    }


    public Double getFinalTotalProfit() {
        if (carCostPrice == null) return 0.0;
        return getFinalPricePaid() - carCostPrice;
    }


    public Double getFinalTotalProfitMarginPercentage() {
        if (carCostPrice == null || carCostPrice == 0) return 0.0;
        return (getFinalTotalProfit() / carCostPrice) * 100;
    }
}
