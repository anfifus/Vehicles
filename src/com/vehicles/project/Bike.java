package com.vehicles.project;


public class Bike extends Vehicle {

    public Bike(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }


    @Override
    public void addWheels(Wheel templateWheel) {


        this.addOneWheel(templateWheel);
        this.addOneWheel(templateWheel);
    }

}
