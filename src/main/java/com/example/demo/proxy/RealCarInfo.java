package com.example.demo.proxy;

public class RealCarInfo implements ICarInfo {
    private String id;
    private String brand;
    private String model;
    private int year;
    private int seats;
    private String fuelType;
    private String transmission;
    private double pricePerDay;
    private boolean available = true;

    public RealCarInfo(String brand, String model, int year, double pricePerDay, boolean available) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public void showNonDetailedInfo() {
        System.out.println("=== Car Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price per Day: $" + pricePerDay);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("========================");
    }
}
