package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class BookingManager implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(o -> o.update(message));
    }

    public void createBooking(String customer, String car) {
        System.out.println("✅ Booking created: " + customer + " -> " + car);
        notifyObservers("Бронювання підтверджено для " + customer + " авто " + car);
    }
}
