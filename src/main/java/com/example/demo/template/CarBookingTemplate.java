package com.example.demo.template;

public abstract class CarBookingTemplate {

    // Шаблон алгоритму (final – не можна змінити порядок)
    public final void bookCar() {
        verifyUser();
        checkCarAvailability();
        calculatePrice();
        makePayment();
        confirmBooking();
    }

    // Фіксовані кроки
    void verifyUser() {
        System.out.println(" User identity verified.");
    }

    void checkCarAvailability() {
        System.out.println(" Car availability checked.");
    }

    void calculatePrice() {
        System.out.println(" Price calculated.");
    }

    void confirmBooking() {
        System.out.println(" Booking confirmed and email sent.");
    }

    // "Гачок" — реалізація у підкласах
    abstract void makePayment();
}
