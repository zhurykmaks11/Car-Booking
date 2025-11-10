package com.example.demo.command;

public class CancelBookingCommand implements Command {
    private BookingService bookingService;
    private String car;
    private String user;

    public CancelBookingCommand(BookingService bookingService, String car, String user) {
        this.bookingService = bookingService;
        this.car = car;
        this.user = user;
    }

    public void execute() {
        bookingService.cancelBooking(car, user);
    }

    public void undo() {
        bookingService.createBooking(car, user);
    }
}
