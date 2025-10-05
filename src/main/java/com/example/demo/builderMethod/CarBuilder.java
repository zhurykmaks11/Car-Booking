package com.example.demo.builderMethod;

import com.example.demo.model.Car;
import lombok.Data;

@Data
public class CarBuilder {
    private String id;
    private String brand;
    private String model;
    private int year;
    private int seats;
    private String fuelType;
    private String transmission;
    private double pricePerDay;
    private boolean available = true;

    public CarBuilder id(String id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder seats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder transmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder pricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public CarBuilder available(boolean available) {
        this.available = available;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

    public boolean getAvailable() {
        return this.available;
    }
}