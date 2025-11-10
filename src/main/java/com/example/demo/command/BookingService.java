package com.example.demo.command;

public class BookingService {
    public void createBooking(String car, String user) {
        System.out.println("Бронювання створене: авто " + car + ", користувач: " + user);
    }

    public void cancelBooking(String car, String user) {
        System.out.println("Бронювання скасоване: авто " + car + ", користувач: " + user);
    }
}
