package com.example.demo.factoryMethod;

public class DailyBooking extends Booking {

    @Override
    public void calculatePrice(int days) {
        this.price = days * 50.0; // 50$ за добу
    }

    @Override
    public String toString() {
        return "DailyBooking, total price: " + price;
    }
}
