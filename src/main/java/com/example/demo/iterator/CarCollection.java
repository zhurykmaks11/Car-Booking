package com.example.demo.iterator;

import com.example.demo.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public CarIterator iterator() {
        return new CarIterator(cars);
    }
}
