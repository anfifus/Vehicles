package com.vehicles.project;

import java.util.List;

public class Tricycle extends Vehicle{

    public Tricycle(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

    @Override
    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) {

    }

    public void addWheels(Wheel frontWheel, List<Wheel> backWheels) throws Exception {
        /*addOneWheel(frontWheel);
        addTwoWheels(backWheels);*/
    }

    /*private void addTwoWheels(List<Wheel> backWheels) throws Exception{

        if (backWheels.size() != 2)
            throw new Exception("The wheels of the car must have 2");

        Wheel rightWheel = backWheels.get(0);
        Wheel leftWheel = backWheels.get(1);

        if (!rightWheel.equals(leftWheel))
            throw new Exception("The right wheel is different size or brand from the left wheel");

        this.wheels.add(rightWheel);
        this.wheels.add(leftWheel);
    }

    private void addOneWheel(Wheel frontWheel) {
        this.wheels.add(frontWheel);
    }*/

}
