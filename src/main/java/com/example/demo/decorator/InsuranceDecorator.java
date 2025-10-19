package com.example.demo.decorator;

public class InsuranceDecorator extends BookingDecorator {

    public InsuranceDecorator(BookingComponent booking) {
        super(booking);
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Страхування";
    }

    @Override
    public double getCost() {
        return booking.getCost() + 30.0;
    }
}
