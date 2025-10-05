package com.example.demo.bridge;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message: " + message + "was sent via email");
    }
}
