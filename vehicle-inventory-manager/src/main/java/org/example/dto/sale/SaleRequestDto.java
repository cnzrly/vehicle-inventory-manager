package org.example.dto.sale;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaleRequestDto {

    private Long carId;
    private Long customerId;

    private Double actualSalePrice;
    private String paymentMethod;

    private Double discountApplied;
    private LocalDateTime saleDate;
    private String saleNotes;
}