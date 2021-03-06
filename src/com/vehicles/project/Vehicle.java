package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected String plate;
    protected String brand;
    protected String color;
    protected List<Wheel> wheels = new ArrayList<>();

    public Vehicle(String plate, String brand, String color) throws Exception {
        checkPlate(plate);
        checkBrand(brand);
        checkColor(color);

        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }

    private static void checkColor(String color) throws Exception {
        if (color == null || color.equals("")) throw new Exception("The color must have value");
    }

    private static void checkBrand(String brand) throws Exception {
        if (brand == null || brand.equals("")) throw new Exception("The brand must have value");
    }

    private static void checkPlate(String plate) throws Exception {
        if (plate == null || plate.equals("")) throw new Exception("The plate must have value");
        if (!controlPlate(plate)) throw new Exception("The plate must have 4 numbers and two or three letters");
    }

    private static boolean controlPlate(String plate) {

        int contNum = 0;
        int contLetter = 0;

        for (int i = 0; i < plate.length(); i++) {
            if (Character.isDigit(plate.charAt(i))) {
                contNum++;
            } else if (Character.isLetter(plate.charAt(i))) {
                contLetter++;
            }
        }
        if (contNum != 4) return false;
        return contLetter == 2 || contLetter == 3;
    }


    public List<Wheel> getWheels() {
        return wheels;
    }

    public abstract void addWheels(Wheel templateWheel) throws Exception;

    protected void addTwoWheels(Wheel templateWheels) {


        this.wheels.add(templateWheels);
        this.wheels.add(templateWheels);
    }

    protected void addOneWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }
}
