package com.example.demo;
import com.example.demo.Composite.CarCompound;
import com.example.demo.abstractFactory.abstractFactory.RentalFactory;
import com.example.demo.abstractFactory.abstractProducts.DriverRequirements;
import com.example.demo.abstractFactory.abstractProducts.InsurancePolicy;
import com.example.demo.abstractFactory.concreteProducts.EuropeRentalFactory;
import com.example.demo.bridge.*;
import com.example.demo.factoryMethod.Booking;
import com.example.demo.objectPool.CarPool;
import com.example.demo.proxy.ICarInfo;
import com.example.demo.proxy.ProxyCarInfo;
import com.example.demo.proxy.RealCarInfo;
import com.example.demo.state.BookingContext;
import com.example.demo.visitor.BookingVisitor;
import com.example.demo.visitor.CarVisitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.factoryMethod.*;
import com.example.demo.builderMethod.*;
import com.example.demo.model.*;
import com.example.demo.adapter.*;
import com.example.demo.flyweight.FlyweightDemo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.decorator.DecoratorDemo;
import com.example.demo.chain.ChainDemo;
import com.example.demo.iterator.IteratorDemo;
import com.example.demo.strategy.StrategyDemo;
import com.example.demo.observer.ObserverDemo;
import com.example.demo.template.TemplateDemo;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		testFactoryMethod();
//		System.out.println("-----------------------------Bilder Patern-----------------------------");
//
//		testBridge();
//
//		System.out.println("-----------------------------Composite Pattern-----------------------------");
//		testComposite();
//
//
//		System.out.println("-----------------------------Adapter Pattern Demo-----------------------------");
//		PaymentProcessor stripeAdapter = new StripeAdapter("John Doe");
//		PaymentService service = new PaymentService(stripeAdapter);
//		service.process(250.75);
//		System.out.println("-----------------------------Flyweight Pattern Demo-----------------------------");
//		FlyweightDemo.runDemo();
//
//		System.out.println("----------------------------- Decorator Pattern Demo-----------------------------");
//		DecoratorDemo.runDemo();
//
//		System.out.println("----------------------------- Chain of Responsibility Demo-----------------------------");
//		ChainDemo.runDemo();
//
//		System.out.println("----------------------------- Iterator Demo-----------------------------");
//		IteratorDemo.runDemo();
//
//		System.out.println("----------------------------- Observer Demo-----------------------------");
//		ObserverDemo.runDemo();
//
//		System.out.println("----------------------------- Proxy Pattern-----------------------------");
//		testProxy();
//
//		System.out.println("-----------------------------Memento Pattern-----------------------------");
//		testMemento();

		System.out.println("----------------------------- Strategy Pattern Demo -----------------------------");
		StrategyDemo.runDemo();

		System.out.println("----------------------------- Template Pattern Demo -----------------------------");
		TemplateDemo.runDemo();

		System.out.println("----------------------------- State Pattern-----------------------------");
		testStatePattern();

		System.out.println("----------------------------- Visitor Pattern-----------------------------");
		testVisitorPattern();
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

//	private static void testBuilderMethod() {
//		User testUser = new User();
//		testUser.setName("Maxim");
//
//		Car testCar = new Car();
//		testCar.setModel("Tesla Model 3");
//
//		BookingDirector director = new BookingDirector();
//
//		ConcreteBooking hourlyBuilt = director.createHourlyBooking(
//				testUser,
//				testCar,
//				LocalDateTime.now(),
//				LocalDateTime.now().plusHours(5),
//				500.0
//		);
//		System.out.println("Builder -> " + hourlyBuilt.getUser().getName() +
//				" booked " + hourlyBuilt.getCar().getModel() +
//				" for " + hourlyBuilt.getStatus());
//
//		ConcreteBooking dailyBuilt = director.createDailyBooking(
//				testUser,
//				testCar,
//				LocalDateTime.now(),
//				LocalDateTime.now().plusDays(3),
//				1500.0
//		);
//		System.out.println("Builder -> " + dailyBuilt.getUser().getName() +
//				" booked " + dailyBuilt.getCar().getModel() +
//				" for " + dailyBuilt.getStatus());
//	}

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

	private static void testComposite(){
		CarCompound carCompound = new CarCompound();

		Car car1 = Car.builder()
				.id("C001")
				.brand("Toyota")
				.model("Corolla")
				.year(2020)
				.seats(5)
				.fuelType("Petrol")
				.transmission("Automatic")
				.pricePerDay(45.99)
				.available(true)
				.build();

		Car car2 = Car.builder()
				.id("C002")
				.brand("Tesla")
				.model("Model 3")
				.year(2023)
				.seats(5)
				.fuelType("Electric")
				.transmission("Automatic")
				.pricePerDay(89.99)
				.available(true)
				.build();

		Car car3 = Car.builder()
				.id("C003")
				.brand("BMW")
				.model("X5")
				.year(2021)
				.seats(7)
				.fuelType("Diesel")
				.transmission("Automatic")
				.pricePerDay(120.00)
				.available(false)
				.build();

		carCompound.addCar(car1);
		carCompound.addCar(car2);
		carCompound.addCar(car3);

		for (var i : carCompound.cars){
			i.showInfo();
		}
	}

	private static void testProxy() {
		// === Приклад 1: Авто доступне для оренди ===
		RealCarInfo car1 = new RealCarInfo(
				"Toyota", "Camry", 2020, 75.0, true
		);

		ICarInfo proxy1 = new ProxyCarInfo(car1);
		System.out.println(">>> Доступне авто:");
		proxy1.showNonDetailedInfo();


		// === Приклад 2: Авто недоступне ===
		RealCarInfo car2 = new RealCarInfo(
				"BMW", "X5", 2021, 120.0, false
		);

		ICarInfo proxy2 = new ProxyCarInfo(car2);
		System.out.println("\n>>> Недоступне авто:");
		proxy2.showNonDetailedInfo();
	}

	private static void testStatePattern(){
		BookingContext booking = new BookingContext();
		System.out.println(booking.getStatus()); // Pending

		booking.proceed(); // Booking confirmed
		System.out.println(booking.getStatus()); // Confirmed

		booking.proceed(); // Booking completed
		System.out.println(booking.getStatus()); // Completed

		booking.cancel(); // Cannot cancel, booking is completed
	}


	private static void testVisitorPattern(){
		Car car1 = new Car("1", "Toyota", "Camry", 2020, 5, "Petrol", "Automatic", 50.0, true, null);
		Car car2 = new Car("2", "BMW", "X5", 2022, 5, "Diesel", "Automatic", 120.0, true, null);

		User user = new User();

		com.example.demo.model.Booking booking1 = new com.example.demo.model.Booking("B001", user, car1, LocalDateTime.now(), LocalDateTime.now().plusDays(3), 150.0, "Confirmed");
		com.example.demo.model.Booking booking2 = new com.example.demo.model.Booking("B002", user, car2, LocalDateTime.now(), LocalDateTime.now().plusDays(2), 240.0, "Pending");

		// Car Visitor
		CarVisitor carVisitor = new CarVisitor();
		car1.accept(carVisitor);
		car2.accept(carVisitor);

		System.out.println();

		// Booking Visitor
		BookingVisitor bookingVisitor = new BookingVisitor();
		booking1.accept(bookingVisitor);
		booking2.accept(bookingVisitor);

		System.out.println("Total revenue from bookings: $" + bookingVisitor.getTotalRevenue());
	}
}
