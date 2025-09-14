package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.model.RentalCompany;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalCompanyService {
    private final RentalCompany rentalCompany = RentalCompany.getInstance();

    public void addCar(Car car){
        rentalCompany.getCars().add(car);
    }

    public boolean removeCar(String carId){
        return rentalCompany.getCars().removeIf(car -> car.getId().equals(carId));
    }

    public Car findById(String carId){
        return rentalCompany.getCars().stream()
                .filter(car -> car.getId().equals(carId))
                .findFirst()
                .orElse(null);
    }

    public List<Car> getAllCars() {
        return rentalCompany.getCars();
    }

    public String getCompanyInfo() {
        return String.format("Company: %s (%s), Cars: %d",
                rentalCompany.getName(),
                rentalCompany.getId(),
                rentalCompany.getCars().size());
    }
}
