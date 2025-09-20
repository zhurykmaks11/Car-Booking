package com.example.demo.abstractFactory.concreteFactory;

import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;

public class EuropeRequirements implements DriverRequirements {
    @Override
    public void checkRequirements() {
        System.out.println("Потрібне міжнародне водійське посвідчення.");
    }
}
