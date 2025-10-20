package com.example.demo.decorator;

public class GpsDecorator extends BookingDecorator {

    public GpsDecorator(BookingComponent booking) {
        super(booking);
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + GPS-навігатор";
    }

    @Override
    public double getCost() {
        return booking.getCost() + 15.0;
    }
}
