package com.example.demo.model;

import com.example.demo.bilderMethod.CarBuilder;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Car implements Cloneable {
    private String id;
    private String brand;
    private String model;
    private int year;
    private int seats;
    private String fuelType;
    private String transmission;
    private double pricePerDay;
    private boolean available = true;

    @Override
    public Car clone() {
        try {
            Car copy = (Car) super.clone();
            System.out.println("[Prototype] Cloned car: " + this.brand + " " + this.model);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Car cloneWithNewId(String newId){
        Car copy = this.clone();
        copy.setId(newId);
        return copy;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public Car(CarBuilder builder) {
        this.id = builder.getId();
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.year = builder.getYear();
        this.seats = builder.getSeats();
        this.fuelType = builder.getFuelType();
        this.transmission = builder.getTransmission();
        this.pricePerDay = builder.getPricePerDay();
        this.available = builder.getAvailable();
    }
}
