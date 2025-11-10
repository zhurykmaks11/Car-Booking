package com.example.demo.strategy;

public interface PricingStrategy {
    double calculatePrice(double baseRate, int duration);
}
