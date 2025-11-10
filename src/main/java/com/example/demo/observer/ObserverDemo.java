package com.example.demo.observer;

public class ObserverDemo {
    public static void runDemo() {
        BookingManager manager = new BookingManager();

        manager.addObserver(new EmailNotifier());
        manager.addObserver(new SmsNotifier());

        System.out.println("=== Observer Pattern Demo ===");
        manager.createBooking("Maxim", "Tesla Model 3");
    }
}
