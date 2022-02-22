package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

    public Car(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

    @Override
    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) {

    }



    /*public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        addTwoWheels(frontWheels);
        addTwoWheels(backWheels);
    }*/

    public void addTwoWheels(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 2)
            throw new Exception("The wheels of the car must have 2");

        Wheel rightWheel = wheels.get(0);
        Wheel leftWheel = wheels.get(1);

        if (!rightWheel.equals(leftWheel))
            throw new Exception("The right wheel is different size or brand from the left wheel");

        this.wheels.add(leftWheel);
        this.wheels.add(rightWheel);
    }


}
