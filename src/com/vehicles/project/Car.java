package com.vehicles.project;


public class Car extends Vehicle {

    public Car(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

    @Override
    public void addWheels(Wheel templateWheel) {
        addTwoWheels(templateWheel);
        addTwoWheels(templateWheel);
    }

}
