package com.example.demo.chain;

public abstract class BaseHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    protected void next(BookingRequest request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
