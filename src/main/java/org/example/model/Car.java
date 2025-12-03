package org.example.model;

import org.example.enums.CarBrand;
import org.example.enums.CarModel;
import org.example.enums.SaleStatus;
import org.example.enums.TransmissionType;

public class Car {
    private Long id;
    private TransmissionType transmissionType;
    private CarBrand brand;
    private CarModel model;
    private Integer year;
    private String color;
    private Double kilometersDriven;
    private Double price;
    private SaleStatus saleStatus;

    public Car(Long id, TransmissionType transmissionType, CarBrand brand, CarModel model, Integer year, String color, Double kilometersDriven, Double price, SaleStatus saleStatus) {
        this.id = id;
        this.transmissionType = transmissionType;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.kilometersDriven = kilometersDriven;
        this.price = price;
        this.saleStatus = saleStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(Double kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(SaleStatus saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", transmissionType=" + transmissionType +
                ", brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", kilometersDriven=" + kilometersDriven +
                ", price=" + price +
                ", saleStatus=" + saleStatus +
                '}';
    }
}
