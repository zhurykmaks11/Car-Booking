package com.example.demo.factoryMethod;

public abstract class BookingCreator {

    public abstract Booking createBooking();


    public Booking processBooking(int timeUnits) {
        Booking booking = createBooking();
        booking.calculatePrice(timeUnits);
        return booking;
    }
}
