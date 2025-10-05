package com.example.demo.bridge;

public class CancelNotification extends Notification{
    CancelNotification(Sender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("Booking canceled");
    }
}
