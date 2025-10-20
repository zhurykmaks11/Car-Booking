package com.example.demo.decorator;

public class DecoratorDemo {
    public static void runDemo() {
        BookingComponent booking = new BasicBooking();
        System.out.println(booking.getDescription() + " | Ціна: " + booking.getCost() + "$");

        booking = new InsuranceDecorator(booking);
        booking = new GpsDecorator(booking);
        booking = new WiFiDecorator(booking);
        booking = new ChildSeatDecorator(booking);

        System.out.println("\nПісля додавання опцій:");
        System.out.println(booking.getDescription() + " | Загальна ціна: " + booking.getCost() + "$");
    }
}
