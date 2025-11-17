package com.example.demo.state;

public class CompletedState implements BookingState {

    @Override
    public void proceed(BookingContext booking) {
        System.out.println("Booking is already completed.");
    }

    @Override
    public void cancel(BookingContext booking) {
        System.out.println("Cannot cancel, booking is completed.");
    }

    @Override
    public String getStatus() {
        return "Completed";
    }
}

