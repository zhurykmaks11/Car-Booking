package com.example.demo.memento;

import com.example.demo.model.Booking;

import java.util.Stack;

public class BookingHistory {
    private Stack<BookingMemento> history = new Stack<>();

    public void saveState(Booking booking) {
        history.push(booking.save());
    }

    public void undo(Booking booking) {
        if (!history.isEmpty()) {
            booking.restore(history.pop());
        }
    }
}
