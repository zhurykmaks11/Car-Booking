package com.example.demo.service;

import com.example.demo.model.RentalCompany;
import org.springframework.stereotype.Service;

@Service
public class RentalCompanyService {
    private final RentalCompany rentalCompany = RentalCompany.getInstance();
}
