package com.example.demo.state;

public class PendingState implements BookingState {

    @Override
    public void proceed(BookingContext booking) {
        booking.setState(new ConfirmedState());
        System.out.println("Booking confirmed.");
    }

    @Override
    public void cancel(BookingContext booking) {
        booking.setState(new CancelledState());
        System.out.println("Booking cancelled.");
    }

    @Override
    public String getStatus() {
        return "Pending";
    }
}

