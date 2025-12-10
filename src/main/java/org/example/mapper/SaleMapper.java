package org.example.mapper;

import org.example.dto.sale.SaleAdminResponseDto;
import org.example.dto.sale.SalePublicResponseDto;
import org.example.dto.sale.SaleRequestDto;
import org.example.model.Sale;

public class SaleMapper {
    public static Sale toEntity(SaleRequestDto saleRequestDto) {
        if (saleRequestDto == null) {
            return null;
        }
        return Sale.builder()
                .carId(saleRequestDto.getCarId())
                .customerId(saleRequestDto.getCustomerId())
                .actualSalePrice(saleRequestDto.getActualSalePrice())
                .paymentMethod(saleRequestDto.getPaymentMethod())
                .discountApplied(saleRequestDto.getDiscountApplied())
                .saleDate(saleRequestDto.getSaleDate())
                .saleNotes(saleRequestDto.getSaleNotes())
                .build();
    }

    public static SaleAdminResponseDto toAdminDto(Sale sale) {
        if (sale == null) {
            return null;
        }
        return SaleAdminResponseDto.builder()
                .id(sale.getId())
                .carId(sale.getCarId())
                .customerId(sale.getCustomerId())
                .saleDate(sale.getSaleDate())
                .carCostPrice(sale.getCarCostPrice())
                .actualSalePrice(sale.getActualSalePrice())
                .discountApplied(sale.getDiscountApplied())
                .paymentMethod(sale.getPaymentMethod())
                .saleNotes(sale.getSaleNotes())
                .totalProfitWithoutDiscount(sale.getTotalProfitWithoutDiscount())
                .profitMarginPercentageWithoutDiscount(sale.getProfitMarginPercentageWithoutDiscount())
                .discountPercentage(sale.getDiscountPercentage())
                .finalPricePaid(sale.getFinalPricePaid())
                .finalTotalProfit(sale.getFinalTotalProfit())
                .finalTotalProfitMarginPercentage(sale.getFinalTotalProfitMarginPercentage())
                .build();
    }

    public static SalePublicResponseDto toPublicDto(Sale sale) {
        if (sale == null) {
            return null;
        }
        return SalePublicResponseDto.builder()
                .saleDate(sale.getSaleDate())
                .actualSalePrice(sale.getActualSalePrice())
                .discountApplied(sale.getDiscountApplied())
                .paymentMethod(sale.getPaymentMethod())
                .saleNotes(sale.getSaleNotes())
                .finalPricePaid(sale.getFinalPricePaid())
                .build();
    }
}
