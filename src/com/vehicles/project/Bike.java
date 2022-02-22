package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

    public Bike(String plate, String brand, String color) throws Exception {
        super(plate, brand, color);
    }

   /* @Override
    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        if (frontWheels.size() != 1 && backWheels.size() != 1)
            throw new Exception("The number of wheels in the bike in on in the front and in the back");

        this.addOneWheel(frontWheels.get(0));
        this.addOneWheel(backWheels.get(0));
    }*/
    @Override
    public void addWheels(Wheel templateWheel) throws Exception {


        this.addOneWheel(templateWheel);
        this.addOneWheel(templateWheel);
    }

}
