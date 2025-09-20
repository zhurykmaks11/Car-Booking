package com.example.demo.abstractFactory.concreteFactory;

import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;

public class EuropeInsurance implements InsurancePolicy {
    @Override
    public void drive(){
        System.out.println("Європейський автомобіль (механіка чи автомат).");
    }
}
