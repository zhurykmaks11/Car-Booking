package com.example.demo.strategy;

public class WeeklyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double baseRate, int weeks) {
        return baseRate * weeks * 5; // Платимо тільки за 5 днів замість 7 (2 дні бонус)
    }
}
