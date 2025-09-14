package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@Component
@Getter
@Setter
public class Payment {
    private String id;
    private String bookingId;
    private double amount;
    private String status;
}



