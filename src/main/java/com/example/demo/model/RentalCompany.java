package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Getter
public class RentalCompany {
    private static final RentalCompany INSTANCE = new RentalCompany();

    private String id;
    private String name;
    private List<Car> cars;

    private RentalCompany() {
        System.out.println("[Singleton] RentalCompany created");
    }

    public static RentalCompany getInstance() {
        return INSTANCE;
    }
}
