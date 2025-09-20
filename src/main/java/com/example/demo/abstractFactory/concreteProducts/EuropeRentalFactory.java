package com.example.demo.abstractFactory.concreteProducts;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteFactory.EuropeInsurance;
import com.example.demo.abstractFactory.concreteFactory.EuropeRequirements;

public class EuropeRentalFactory implements RentalFactory {
    @Override
    public InsurancePolicy createInsurance() {
        return new EuropeInsurance();
    }

    @Override
    public DriverRequirements createRequirements() {
        return new EuropeRequirements();
    }
}
