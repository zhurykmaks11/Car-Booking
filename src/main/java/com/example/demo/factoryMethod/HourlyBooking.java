package com.example.demo.factoryMethod;

public class HourlyBooking extends Booking {

    @Override
    public void calculatePrice(int hours) {
        this.price = hours * 10.0; // 10$ за годину
    }

    @Override
    public String toString() {
        return "HourlyBooking, total price: " + price;
    }
}
