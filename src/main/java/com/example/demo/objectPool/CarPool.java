package com.example.demo.objectPool;

import com.example.demo.model.Car;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CarPool {
    private final List<Car> available = new ArrayList<>();
    private final List<Car> inUse = new ArrayList<>();
    private final Integer maxSize = 5;

    public CarPool() {
        available.add(Car.builder()
                .id("C001")
                .brand("Toyota")
                .model("Corolla")
                .year(2022)
                .seats(5)
                .fuelType("Petrol")
                .transmission("Automatic")
                .pricePerDay(45.99)
                .available(true)
                .build());

        available.add(Car.builder()
                .id("C002")
                .brand("Tesla")
                .model("Model 3")
                .fuelType("Electric")
                .pricePerDay(89.99)
                .build());
    }

    public Car getCar(){
        if (available.isEmpty()) {
            return null;
        }
        Car instance = available.remove(available.size() - 1);
        inUse.add(instance);
        return instance;
    }

    public void release(Car instance){
        inUse.remove(instance);
        available.add(instance);
    }
}
