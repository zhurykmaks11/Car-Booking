package com.example.demo.bridge;

public abstract class Notification {
    public Sender sender;
    public abstract void send();
}
