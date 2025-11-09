package com.example.demo.iterator;

import com.example.demo.model.Car;
import java.util.List;

public class CarIterator {
    private int index = 0;
    private final List<Car> cars;

    public CarIterator(List<Car> cars) {
        this.cars = cars;
    }

    public boolean hasNext() {
        return index < cars.size();
    }

    public Car next() {
        return cars.get(index++);
    }
}
