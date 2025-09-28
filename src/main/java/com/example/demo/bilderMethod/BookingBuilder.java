package com.example.demo.bilderMethod;
import com.example.demo.model.Booking;
import com.example.demo.model.Car;
import com.example.demo.model.Payment;
import com.example.demo.model.RentalCompany;
import com.example.demo.model.User;

import java.time.LocalDateTime;

public class BookingBuilder {
    private User user;
    private Car car;
    private RentalCompany rentalCompany;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Payment payment;
    private String type; // "hourly", "daily", etc.

    public BookingBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public BookingBuilder setCar(Car car) {
        this.car = car;
        return this;
    }

    public BookingBuilder setRentalCompany(RentalCompany rentalCompany) {
        this.rentalCompany = rentalCompany;
        return this;
    }

    public BookingBuilder setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public BookingBuilder setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public BookingBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Booking build() {
        return new Booking(user, car, rentalCompany, startTime, endTime, payment, type);
    }
}
