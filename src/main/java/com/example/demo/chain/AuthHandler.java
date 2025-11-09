package com.example.demo.chain;

public class AuthHandler extends BaseHandler {
    @Override
    public void handle(BookingRequest request) {
        if (!request.isAuthenticated) {
            System.out.println("❌ Користувач не авторизований!");
            return;
        }
        System.out.println("✅ Авторизація пройдена");
        next(request);
    }
}
