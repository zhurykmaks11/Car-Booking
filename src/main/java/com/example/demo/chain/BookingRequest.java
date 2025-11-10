package com.example.demo.chain;

public class BookingRequest {
    public boolean isAuthenticated;
    public boolean hasValidLicense;
    public boolean carAvailable;
    public boolean paymentValid;

    public BookingRequest(boolean isAuthenticated, boolean hasValidLicense,
                          boolean carAvailable, boolean paymentValid) {
        this.isAuthenticated = isAuthenticated;
        this.hasValidLicense = hasValidLicense;
        this.carAvailable = carAvailable;
        this.paymentValid = paymentValid;
    }
}
