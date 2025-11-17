package com.example.demo.state;

public interface BookingState {
    void proceed(BookingContext booking);
    void cancel(BookingContext booking);
    String getStatus();
}

