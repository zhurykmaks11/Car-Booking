package com.example.demo.abstractFactory.concreteFactory;

import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;

public class USARequirements implements DriverRequirements {
    @Override
    public void checkRequirements() {
        System.out.println("Мінімальний вік — 21 рік.");
    }
}
