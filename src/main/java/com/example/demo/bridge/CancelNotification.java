package com.example.demo.bridge;

public class CancelNotification extends Notification{
    @Override
    public void send() {
        sender.sendMessage("Booking canceled");
    }
}
