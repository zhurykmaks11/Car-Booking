package com.example.demo.factoryMethod;

public abstract class Booking {
    protected double price;

    public abstract void calculatePrice(int timeUnits); // годин або днів

    public double getPrice() {
        return price;
    }
}
