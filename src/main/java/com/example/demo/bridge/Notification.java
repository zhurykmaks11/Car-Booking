package com.example.demo.bridge;

public abstract class Notification {
    public Sender sender;

    Notification(Sender sender){
        this.sender = sender;
    }
    public abstract void send();
}
