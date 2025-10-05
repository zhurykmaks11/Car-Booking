package com.example.demo.builderMethod;

import com.example.demo.model.Car;
import com.example.demo.model.ConcreteBooking;
import com.example.demo.model.User;

import java.time.LocalDateTime;

public class BookingBuilder {
    private String id;
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private double totalPrice;
    private String status;

    public BookingBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public BookingBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public BookingBuilder setCar(Car car) {
        this.car = car;
        return this;
    }

    public BookingBuilder setFrom(LocalDateTime from) {
        this.from = from;
        return this;
    }

    public BookingBuilder setTo(LocalDateTime to) {
        this.to = to;
        return this;
    }

    public BookingBuilder setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public BookingBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public ConcreteBooking build() {
        return new ConcreteBooking(id, user, car, from, to, totalPrice, status);
    }
}
