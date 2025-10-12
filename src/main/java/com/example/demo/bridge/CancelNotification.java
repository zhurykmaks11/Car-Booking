package com.example.demo.bridge;

public class CancelNotification extends Notification{
    public CancelNotification(Sender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("Booking canceled");
    }
}
