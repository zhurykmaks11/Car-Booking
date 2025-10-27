package com.example.demo.proxy;

public class ProxyCarInfo extends RealCarInfo{
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
    public void showNonDetailedInfo() {
        if(available) {
            System.out.println("=== Car Information ===");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price per Day: $" + pricePerDay);
            System.out.println("Available: " + (available ? "Yes" : "No"));
            System.out.println("========================");
        }
        else{
            System.out.println("=== Car is not Available ===");
        }
    }
}
