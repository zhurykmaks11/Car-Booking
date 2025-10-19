package com.example.demo.decorator;

public class WiFiDecorator extends BookingDecorator {

    public WiFiDecorator(BookingComponent booking) {
        super(booking);
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Wi-Fi у салоні";
    }

    @Override
    public double getCost() {
        return booking.getCost() + 10.0; // Додаємо 10₴ за Wi-Fi
    }
}
