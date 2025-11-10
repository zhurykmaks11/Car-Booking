package com.example.demo.chain;

public interface Handler {
    void setNext(Handler next);
    void handle(BookingRequest request);
}
