package com.example.demo.visitor;

import com.example.demo.model.Booking;

public class BookingVisitor implements Visitor {
    private double totalRevenue = 0;

    @Override
    public void visit(com.example.demo.model.Car car) {
        // Не використовується у цьому Visitor
    }

    @Override
    public void visit(Booking booking) {
        totalRevenue += booking.getTotalPrice();
        System.out.println("Booking ID: " + booking.getId() + ", Total Price: $" + booking.getTotalPrice());
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
