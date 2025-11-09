package com.example.demo.chain;

public class ChainDemo {
    public static void runDemo() {
        Handler auth = new AuthHandler();
        Handler license = new LicenseHandler();
        Handler availability = new CarAvailabilityHandler();
        Handler payment = new PaymentHandler();

        auth.setNext(license);
        license.setNext(availability);
        availability.setNext(payment);

        System.out.println("--- Тест 1: Успішне бронювання ---");
        BookingRequest ok = new BookingRequest(true, true, true, true);
        auth.handle(ok);

        System.out.println("\n--- Тест 2: Відсутня валідна ліцензія ---");
        BookingRequest fail = new BookingRequest(true, false, true, true);
        auth.handle(fail);
    }
}
