package com.example.demo.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public static void runDemo() {
        List<RentalCar> cars = new ArrayList<>();

        cars.add(new RentalCar("AA1111AA", "Kyiv", CarTypeFactory.getCarType("BMW", "X5", "Black")));
        cars.add(new RentalCar("AA2222AA", "Lviv", CarTypeFactory.getCarType("BMW", "X5", "Black")));
        cars.add(new RentalCar("AA3333AA", "Odesa", CarTypeFactory.getCarType("BMW", "X5", "Black")));
        cars.add(new RentalCar("BB1111BB", "Kyiv", CarTypeFactory.getCarType("Tesla", "Model 3", "White")));

        for (RentalCar car : cars) {
            car.showCar();
        }

        System.out.println("\n📦 Total unique CarTypes: " + CarTypeFactory.getCacheSize());
    }
}
