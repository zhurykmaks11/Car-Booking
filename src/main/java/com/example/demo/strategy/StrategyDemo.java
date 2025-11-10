package com.example.demo.strategy;

public class StrategyDemo {
    public static void runDemo() {
        double baseRate = 20.0;

        PriceCalculator calculator = new PriceCalculator(new HourlyPricingStrategy());
        System.out.println("Hourly (5h): " + calculator.calculate(baseRate, 5));

        calculator.setStrategy(new DailyPricingStrategy());
        System.out.println("Daily (3 days): " + calculator.calculate(baseRate, 3));

        calculator.setStrategy(new WeeklyPricingStrategy());
        System.out.println("Weekly (1 week): " + calculator.calculate(baseRate, 1));
    }
}
