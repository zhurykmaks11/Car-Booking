package com.example.demo.command;

public class CreateBookingCommand implements Command {
    private BookingService bookingService;
    private String car;
    private String user;

    public CreateBookingCommand(BookingService bookingService, String car, String user) {
        this.bookingService = bookingService;
        this.car = car;
        this.user = user;
    }

    public void execute() {
        bookingService.createBooking(car, user);
    }

    public void undo() {
        bookingService.cancelBooking(car, user);
    }
}
