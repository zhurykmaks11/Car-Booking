package com.example.demo.chain;

public class CarAvailabilityHandler extends BaseHandler {
    @Override
    public void handle(BookingRequest request) {
        if (!request.carAvailable) {
            System.out.println("❌ Авто недоступне на обрані дати");
            return;
        }
        System.out.println("✅ Авто доступне");
        next(request);
    }
}
