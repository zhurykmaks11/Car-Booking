package com.example.demo.strategy;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double baseRate, int hours) {
        return baseRate * hours;
    }
}
