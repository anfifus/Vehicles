package com.vehicles.project;


public class Tricycle extends Vehicle {

    public Tricycle(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

    @Override
    public void addWheels(Wheel templateWheel) {


        addOneWheel(templateWheel);

        addTwoWheels(templateWheel);
    }

}
