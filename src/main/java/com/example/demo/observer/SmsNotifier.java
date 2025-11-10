package com.example.demo.observer;

public class SmsNotifier implements Observer {
    @Override
    public void update(String message) {
        System.out.println("📱 SMS notification: " + message);
    }
}
