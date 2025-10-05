package com.example.demo.bridge;

public class PushSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message: " + message + "was sent via push message");
    }
}
