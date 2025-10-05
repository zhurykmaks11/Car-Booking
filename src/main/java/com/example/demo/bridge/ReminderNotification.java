package com.example.demo.bridge;

public class ReminderNotification extends Notification{
    ReminderNotification(Sender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("Remind about booking");
    }
}
