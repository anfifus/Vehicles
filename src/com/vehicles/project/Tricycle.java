package com.vehicles.project;

import java.util.List;

public class Tricycle extends Vehicle {

    public Tricycle(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

    /*@Override
    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        if (frontWheels.size() != 1 && backWheels.size() != 2)
            throw new Exception("The number of wheels in the front must be one and the back two");

        addOneWheel(frontWheels.get(0));

        addTwoWheels(backWheels);
    }*/
    @Override
    public void addWheels(Wheel templateWheel) throws Exception {


        addOneWheel(templateWheel);

        addTwoWheels(templateWheel);
    }

}
