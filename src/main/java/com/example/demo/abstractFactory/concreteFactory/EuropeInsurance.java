package com.example.demo.abstractFactory.concreteFactory;

import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;

public class EuropeInsurance implements InsurancePolicy {
    @Override
    public void insure(){
        System.out.println("Страхування за європейськими стандартами.");
    }
}
