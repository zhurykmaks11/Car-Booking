package com.example.demo.flyweight;

public class CarType {
    private final String brand;
    private final String model;
    private final String color;

    public CarType(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void showInfo(String plateNumber, String location) {
        System.out.println("🚗 " + brand + " " + model + " (" + color +
                "), Plate: " + plateNumber + ", Location: " + location);
    }
}
