package com.example.demo.decorator;

public abstract class BookingDecorator implements BookingComponent {
    protected BookingComponent booking;

    public BookingDecorator(BookingComponent booking) {
        this.booking = booking;
    }

    @Override
    public String getDescription() {
        return booking.getDescription();
    }

    @Override
    public double getCost() {
        return booking.getCost();
    }
}
