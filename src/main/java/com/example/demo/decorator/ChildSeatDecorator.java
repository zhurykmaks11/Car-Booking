package com.example.demo.decorator;

public class ChildSeatDecorator extends BookingDecorator {

    public ChildSeatDecorator(BookingComponent booking) {
        super(booking);
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Дитяче крісло";
    }

    @Override
    public double getCost() {
        return booking.getCost() + 20.0; // Додаємо 20₴ за крісло
    }
}
