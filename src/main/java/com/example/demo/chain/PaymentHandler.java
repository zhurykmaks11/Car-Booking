package com.example.demo.chain;

public class PaymentHandler extends BaseHandler {
    @Override
    public void handle(BookingRequest request) {
        if (!request.paymentValid) {
            System.out.println("❌ Платіж відхилено");
            return;
        }
        System.out.println("✅ Платіж підтверджено");
        System.out.println("🎉 Бронювання успішно створено!");
    }
}
