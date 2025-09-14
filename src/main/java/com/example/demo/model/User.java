package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private String name;
    private String email;
    private String phone;
    private Role role;
}
