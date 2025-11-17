package com.example.demo.state;

public class ConfirmedState implements BookingState {

    @Override
    public void proceed(BookingContext booking) {
        booking.setState(new CompletedState());
        System.out.println("Booking completed.");
    }

    @Override
    public void cancel(BookingContext booking) {
        booking.setState(new CancelledState());
        System.out.println("Booking cancelled.");
    }

    @Override
    public String getStatus() {
        return "Confirmed";
    }
}

