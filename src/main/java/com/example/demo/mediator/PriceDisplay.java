package com.example.demo.mediator;

public class PriceDisplay extends Component {
    public void updatePrice(String car) {
        System.out.println("Оновлюємо ціну для: " + car + " (ціна взята з бази)");
    }
}