package com.example.demo.abstractFactory.abstractFactory;

import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;

public interface RentalFactory {
    public InsurancePolicy createInsurance();
    public DriverRequirements createRequirements();
}
