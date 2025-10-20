package com.example.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarTypeFactory {
    private static final Map<String, CarType> carTypes = new HashMap<>();

    public static CarType getCarType(String brand, String model, String color) {
        String key = brand + "_" + model + "_" + color;
        if (!carTypes.containsKey(key)) {
            carTypes.put(key, new CarType(brand, model, color));
            System.out.println("🆕 Created new CarType: " + key);
        }
        return carTypes.get(key);
    }

    public static int getCacheSize() {
        return carTypes.size();
    }
}
