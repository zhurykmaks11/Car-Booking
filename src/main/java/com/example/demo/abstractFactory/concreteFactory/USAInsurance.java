package com.example.demo.abstractFactory.concreteFactory;

import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;

public class USAInsurance implements InsurancePolicy {
    @Override
    public void insure() {
        System.out.println("Страхування за стандартами США.");    }
}
