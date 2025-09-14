package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class RentalCompany {
    private static final RentalCompany INSTANCE = new RentalCompany();

    private String id;
    private String name;
    private List<Car> cars;

    private RentalCompany() {
        System.out.println("[Singleton] BookingManager created");
    }

    public static RentalCompany getInstance() {
        return INSTANCE;
    }
}
