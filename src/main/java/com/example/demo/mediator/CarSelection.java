package com.example.demo.mediator;

public class CarSelection extends Component {
    private String selectedCar;

    public void selectCar(String car) {
        this.selectedCar = car;
        System.out.println("Обрано автомобіль: " + car);
        mediator.notify(this, "carSelected");
    }

    public String getSelectedCar() {
        return selectedCar;
    }
}

