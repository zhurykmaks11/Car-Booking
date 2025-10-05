package com.example.demo.bridge;

public class ReminderNotification extends Notification{
    public ReminderNotification(Sender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage("Remind about booking");
    }
}
