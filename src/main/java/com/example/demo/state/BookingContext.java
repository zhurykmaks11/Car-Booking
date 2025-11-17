package com.example.demo.state;

public class BookingContext {
    private BookingState state;

    public BookingContext() {
        this.state = new PendingState(); // Початковий стан
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public void proceed() {
        state.proceed(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}

