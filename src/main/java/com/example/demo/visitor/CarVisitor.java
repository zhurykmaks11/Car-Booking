package com.example.demo.visitor;

import com.example.demo.model.Car;

public class CarVisitor implements Visitor {

    @Override
    public void visit(Car car) {
        System.out.println("=== Visiting Car ===");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price per Day: $" + car.getPricePerDay());
        System.out.println("Available: " + (car.isAvailable() ? "Yes" : "No"));
        System.out.println("====================");
    }

    @Override
    public void visit(com.example.demo.model.Booking booking) {
        // Не використовується у цьому Visitor
    }
}
