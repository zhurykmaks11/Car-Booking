package com.example.demo.mediator;

public class CarBookingMediator implements BookingMediator {

    private CarSelection carSelection;
    private PriceDisplay priceDisplay;
    private PaymentButton paymentButton;

    public CarBookingMediator(CarSelection carSelection, PriceDisplay priceDisplay, PaymentButton paymentButton) {
        this.carSelection = carSelection;
        this.priceDisplay = priceDisplay;
        this.paymentButton = paymentButton;

        this.carSelection.setMediator(this);
        this.priceDisplay.setMediator(this);
        this.paymentButton.setMediator(this);
    }

    public void notify(Component sender, String event) {
        if (sender instanceof CarSelection && event.equals("carSelected")) {
            priceDisplay.updatePrice(carSelection.getSelectedCar());
            paymentButton.enable();
        }
    }
}
