package com.example.demo.mediator;

public class PaymentButton extends Component {
    public void enable() {
        System.out.println("Кнопка оплати активована");
    }

    public void disable() {
        System.out.println("Кнопка оплати не активна");
    }
}