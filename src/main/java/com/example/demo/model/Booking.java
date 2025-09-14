package com.example.demo.model;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Booking {
    private String id;
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private double totalPrice;
    private String status;
}
