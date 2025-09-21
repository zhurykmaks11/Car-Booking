package com.example.demo.factoryMethod;

public class HourlyBookingCreator extends BookingCreator {

    @Override
    public Booking createBooking() {
        return new HourlyBooking();
    }
}
