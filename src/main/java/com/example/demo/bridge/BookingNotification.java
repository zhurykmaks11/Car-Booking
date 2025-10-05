package com.example.demo.bridge;

public class BookingNotification extends Notification{
    BookingNotification(Sender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("New booking");
    }
}
