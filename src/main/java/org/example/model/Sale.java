package org.example.model;

import java.util.Date;

public class Sale {
    private Long id;
    private Long carId;
    private Long customerId;
    private Date saleDate;
    private Double ActualSalePrice;

    public Sale(Long id, Long carId, Long customerId, Date saleDate, Double ActualSalePrice) {
        this.id = id;
        this.carId = carId;
        this.customerId = customerId;
        this.saleDate = saleDate;
        this.ActualSalePrice = ActualSalePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Double getSalePrice() {
        return ActualSalePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.ActualSalePrice = salePrice;
    }
}
