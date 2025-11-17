package com.example.demo.strategy;

public class DailyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double baseRate, int days) {
        return baseRate * days * 0.9; // 10% знижка за подобу
    }
}
