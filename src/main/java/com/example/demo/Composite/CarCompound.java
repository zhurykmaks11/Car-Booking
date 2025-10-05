package com.example.demo.Composite;

import java.util.ArrayList;
import java.util.List;

public class CarCompound {
    public List<CarComponent> cars;

    public CarCompound(){
        cars = new ArrayList<>();
    }

    public void addCar(CarComponent carComponent){
        cars.add(carComponent);
    }

    public void deleteCar(int position){
        cars.remove(position);
    }
}
