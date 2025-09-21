package com.example.demo.factoryMethod;

public class DailyBookingCreator extends BookingCreator {

    @Override
    public Booking createBooking() {
        return new DailyBooking();
    }
}
