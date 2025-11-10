package com.example.demo.template;

public class CarporateBooking extends CarBookingTemplate {

    @Override
    void makePayment() {
        System.out.println("Corporate invoice issued for payment.");
    }
}
