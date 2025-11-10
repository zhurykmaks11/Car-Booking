package com.example.demo.chain;

public class LicenseHandler extends BaseHandler {
    @Override
    public void handle(BookingRequest request) {
        if (!request.hasValidLicense) {
            System.out.println("❌ Водійське посвідчення не підтверджено!");
            return;
        }
        System.out.println("✅ Водійське посвідчення перевірено");
        next(request);
    }
}
