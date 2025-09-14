package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
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
}
