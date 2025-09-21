package com.example.demo;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteProducts.EuropeRentalFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		RentalFactory factory = new EuropeRentalFactory();

		InsurancePolicy insurance = factory.createInsurance();
		DriverRequirements requirements = factory.createRequirements();

		insurance.insure();
		requirements.checkRequirements();
	}

}
