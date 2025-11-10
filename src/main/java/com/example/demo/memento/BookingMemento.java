package com.example.demo.memento;

import com.example.demo.model.Car;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BookingMemento {
    private String id;
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private double totalPrice;
    private String status;
}
