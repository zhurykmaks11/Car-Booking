package com.example.demo.template;

public class OnlineBooking extends CarBookingTemplate {

    @Override
    void makePayment() {
        System.out.println(" Payment processed via Credit Card.");
    }
}
