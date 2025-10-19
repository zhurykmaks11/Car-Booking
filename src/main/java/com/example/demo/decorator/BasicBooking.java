package com.example.demo.decorator;

public class BasicBooking implements BookingComponent {

    @Override
    public String getDescription() {
        return "Базове бронювання авто";
    }

    @Override
    public double getCost() {
        return 100.0; // базова ціна
    }
}
