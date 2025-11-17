package com.example.demo.visitor;

import com.example.demo.model.Booking;
import com.example.demo.model.Car;

public interface Visitor {
    void visit(Car car);
    void visit(Booking booking);
}

