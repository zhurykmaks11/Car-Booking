package com.example.demo.model;
import java.time.LocalDateTime;

import com.example.demo.memento.BookingMemento;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public abstract class Booking {
    private String id;
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private double totalPrice;
    private String status;

    public BookingMemento save() {
        return new BookingMemento(id, user, car, from, to, totalPrice, status);
    }

    public void restore(BookingMemento memento) {
        this.id = memento.getId();
        this.user = memento.getUser();
        this.car = memento.getCar();
        this.from = memento.getFrom();
        this.to = memento.getTo();
        this.totalPrice = memento.getTotalPrice();
        this.status = memento.getStatus();
    }
}

