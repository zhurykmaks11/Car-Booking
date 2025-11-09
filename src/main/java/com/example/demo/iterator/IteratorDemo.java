package com.example.demo.iterator;

import com.example.demo.builderMethod.CarBuilder;
import com.example.demo.model.Car;

public class IteratorDemo {
    public static void runDemo() {

        CarCollection collection = new CarCollection();

        collection.add(
                new CarBuilder()
                        .id("1")
                        .brand("Tesla")
                        .model("Model 3")
                        .year(2022)
                        .seats(5)
                        .fuelType("Electric")
                        .transmission("Automatic")
                        .pricePerDay(80)
                        .available(true)
                        .build()
        );

        collection.add(
                new CarBuilder()
                        .id("2")
                        .brand("BMW")
                        .model("X5")
                        .year(2021)
                        .seats(5)
                        .fuelType("Diesel")
                        .transmission("Automatic")
                        .pricePerDay(120)
                        .available(true)
                        .build()
        );

        collection.add(
                new CarBuilder()
                        .id("3")
                        .brand("Toyota")
                        .model("Corolla")
                        .year(2020)
                        .seats(5)
                        .fuelType("Petrol")
                        .transmission("Automatic")
                        .pricePerDay(50)
                        .available(true)
                        .build()
        );

        System.out.println("\n=== Iterator Pattern Demo ===");

        CarIterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println("🚗 Auto: "
                    + car.getBrand() + " " + car.getModel()
                    + " | Price per day: $" + car.getPricePerDay()
            );
        }
    }
}
