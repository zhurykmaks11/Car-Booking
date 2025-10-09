package com.example.demo.adapter;

public class PaymentService {
    private PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void process(double amount) {
        System.out.println("💳 Processing payment...");
        processor.pay(amount);
        System.out.println("✅ Payment completed!\n");
    }
}
