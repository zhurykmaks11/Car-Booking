package com.example.demo;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteProducts.EuropeRentalFactory;
import com.example.demo.factoryMethod.Booking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.factoryMethod.*;
import com.example.demo.bilderMethod.*;
import com.example.demo.model.*;

import java.time.LocalDateTime;

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

		//Bilder test
		User testUser = new User(); // у тебе є модель User
		testUser.setName("Maxim");

		Car testCar = new Car(); // у тебе є модель Car
		testCar.setModel("Tesla Model 3");

		BookingDirector director = new BookingDirector();

		// Створимо бронювання на години
		ConcreteBooking hourlyBuilt = director.createHourlyBooking(
				testUser,
				testCar,
				LocalDateTime.now(),
				LocalDateTime.now().plusHours(5),
				500.0
		);
		System.out.println("Builder -> " + hourlyBuilt.getUser().getName() +
				" booked " + hourlyBuilt.getCar().getModel() +
				" for " + hourlyBuilt.getStatus());

		// Створимо бронювання на дні
		ConcreteBooking dailyBuilt = director.createDailyBooking(
				testUser,
				testCar,
				LocalDateTime.now(),
				LocalDateTime.now().plusDays(3),
				1500.0
		);
		System.out.println("Builder -> " + dailyBuilt.getUser().getName() +
				" booked " + dailyBuilt.getCar().getModel() +
				" for " + dailyBuilt.getStatus());
	}
}
