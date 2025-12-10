package org.example.dto.sale;

import lombok.Builder;
import lombok.Data;
import org.example.dto.car.CarPublicResponseDto;

import java.time.LocalDateTime;

@Data
@Builder
public class SalePublicResponseDto {
    private CarPublicResponseDto carPublicResponseDto;
    private LocalDateTime saleDate;
    private Double actualSalePrice;
    private Double discountApplied;
    private String paymentMethod;
    private String saleNotes;
    private Double finalPricePaid;

}
