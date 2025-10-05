package com.example.demo;

import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteProducts.EuropeRentalFactory;
import com.example.demo.bridge.*;
import com.example.demo.factoryMethod.Booking;
import com.example.demo.objectPool.CarPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.factoryMethod.*;
import com.example.demo.bilderMethod.*;
import com.example.demo.model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		testBridge();
	}

	private static void testAbstractFactory() {
		RentalFactory factory = new EuropeRentalFactory();

		InsurancePolicy insurance = factory.createInsurance();
		DriverRequirements requirements = factory.createRequirements();

		insurance.insure();
		requirements.checkRequirements();
	}

	private static void testFactoryMethod() {
		BookingCreator hourlyCreator = new HourlyBookingCreator();
		Booking hourlyBooking = hourlyCreator.processBooking(5);
		System.out.println(hourlyBooking);

		BookingCreator dailyCreator = new DailyBookingCreator();
		Booking dailyBooking = dailyCreator.processBooking(3);
		System.out.println(dailyBooking);
	}

	private static void testBuilderMethod() {
		User testUser = new User();
		testUser.setName("Maxim");

		Car testCar = new Car();
		testCar.setModel("Tesla Model 3");

		BookingDirector director = new BookingDirector();

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

	private static void testObjectPool() {
		CarPool pool = new CarPool();

		Car car1 = pool.getCar();
		System.out.println("Отримано авто 1: " + car1.getBrand() + " " + car1.getModel());

		Car car2 = pool.getCar();
		System.out.println("Отримано авто 2: " + car2.getBrand() + " " + car2.getModel());

		Car car3 = pool.getCar();
		if (car3 == null) {
			System.out.println("Немає доступних автомобілів у пулі!");
		}

		pool.release(car1);
		System.out.println("Повернено авто 1 назад у пул.");

		Car car4 = pool.getCar();
		System.out.println("Отримано авто 4: " + car4.getBrand() + " " + car4.getModel());

		System.out.println("car1 == car4 ? " + (car1 == car4));
	}

	private static void testBridge(){
		List<Notification> notifications = new ArrayList<>();

		notifications.add(new BookingNotification(new EmailSender()));
		notifications.add(new CancelNotification(new SMSSender()));
		notifications.add(new ReminderNotification(new PushSender()));

		for(var i : notifications){
			i.send();
		}

	}
}
