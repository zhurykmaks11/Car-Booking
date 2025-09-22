package com.example.demo;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteProducts.EuropeRentalFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.factoryMethod.*;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		RentalFactory factory = new EuropeRentalFactory();

		InsurancePolicy insurance = factory.createInsurance();
		DriverRequirements requirements = factory.createRequirements();

		insurance.insure();
		requirements.checkRequirements();

		// Перевірка Factory Method
		BookingCreator hourlyCreator = new HourlyBookingCreator();
		Booking hourlyBooking = hourlyCreator.processBooking(5);
		System.out.println(hourlyBooking);

		BookingCreator dailyCreator = new DailyBookingCreator();
		Booking dailyBooking = dailyCreator.processBooking(3);
		System.out.println(dailyBooking);
	}

}
