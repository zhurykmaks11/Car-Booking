package com.example.demo.template;

public class TemplateDemo {
    public static void runDemo() {

        System.out.println("\n=== Template Method Pattern Demo ===");

        CarBookingTemplate online = new OnlineBooking();
        System.out.println("\n--- Online Booking Process ---");
        online.bookCar();

        CarBookingTemplate corp = new CarporateBooking();
        System.out.println("\n--- Corporate Booking Process ---");
        corp.bookCar();
    }
}
