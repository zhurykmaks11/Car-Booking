package com.example.demo.flyweight;

public class RentalCar {
    private final String plateNumber;
    private final String location;
    private final CarType carType;

    public RentalCar(String plateNumber, String location, CarType carType) {
        this.plateNumber = plateNumber;
        this.location = location;
        this.carType = carType;
    }

    public void showCar() {
        carType.showInfo(plateNumber, location);
    }
}
