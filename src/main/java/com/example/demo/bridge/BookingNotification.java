package com.example.demo.bridge;

public class BookingNotification extends Notification{
    @Override
    public void send() {
        sender.sendMessage("New booking");
    }
}
