package com.example.demo.state;

public class CancelledState implements BookingState {

    @Override
    public void proceed(BookingContext booking) {
        System.out.println("Cannot proceed, booking is cancelled.");
    }

    @Override
    public void cancel(BookingContext booking) {
        System.out.println("Booking is already cancelled.");
    }

    @Override
    public String getStatus() {
        return "Cancelled";
    }
}

