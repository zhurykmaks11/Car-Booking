package com.example.demo.mediator;

public abstract class Component {
    protected BookingMediator mediator;

    public void setMediator(BookingMediator mediator) {
        this.mediator = mediator;
    }
}
