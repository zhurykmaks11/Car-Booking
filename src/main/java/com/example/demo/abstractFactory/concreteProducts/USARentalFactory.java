package com.example.demo.abstractFactory.concreteProducts;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteFactory.USAInsurance;
import com.example.demo.abstractFactory.concreteFactory.USARequirements;

public class USARentalFactory implements RentalFactory {
    @Override
    public InsurancePolicy createInsurance() {
        return new USAInsurance();
    }

    @Override
    public DriverRequirements createRequirements() {
        return new USARequirements();
    }
}
