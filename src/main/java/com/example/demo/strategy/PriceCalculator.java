package com.example.demo.strategy;

public class PriceCalculator {

    private PricingStrategy strategy;

    public PriceCalculator(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double baseRate, int duration) {
        return strategy.calculatePrice(baseRate, duration);
    }
}
