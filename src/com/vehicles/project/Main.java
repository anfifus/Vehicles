package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private final static int CAR = 1;
    private final static int BIKE = 2;
    private final static int TRICYCLE = 3;

    private final static int TWO_WHEELS = 2;
    private final static int ONE_WHEEL = 1;


    public static void main(String[] args) {


        try {
            int option = chooseVehicleType();
            Vehicle vehicle = createVehicle(option);
            addWheelsToTheVehicle(vehicle);

            showResults(vehicle);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    private static int chooseVehicleType() {
        showMenu();
        return (new Scanner(System.in).nextInt());
    }

    private static Vehicle createVehicle(int option) throws Exception {
        Vehicle vehicle = null;
        switch (option) {
            case CAR -> {
                vehicle = createCar();
            }
            case BIKE -> {
                vehicle = createBike();
            }
            case TRICYCLE -> {
                vehicle = createTricycle();
            }
            default -> throw new Exception("Need to select the correct option or the vehicle will not created");
        }
        return vehicle;
    }

    private static void addWheelsToTheVehicle(Vehicle vehicle) throws Exception {

        if (vehicle instanceof Car) {

            //vehicle.addWheels(createTwoWheel(), createTwoWheel());


        } else if (vehicle instanceof Bike) {


            //vehicle.addWheels(createFinalWheel(), createFinalWheel());


        } else if (vehicle instanceof Tricycle) {

           // vehicle.addWheels(createFinalWheel(), createTwoWheel());
        }
        vehicle.addWheels(createWheel());
    }

    private static void showMenu() {

        System.out.println("1-Create a car");
        System.out.println("2-Create a bike");
        System.out.println("3-Create a tricycle");


    }


    private static Vehicle createTricycle() throws Exception {
        Tricycle tricycle = null;
        tricycle = new Tricycle(askPlate(), askBrand(), askColor());

        return tricycle;
    }

    private static void showResults(Vehicle vehicle) {



            System.out.println("The brand of the car is: " + vehicle.getWheels().size());



    }


    private static Vehicle createBike() throws Exception {
        Bike bike = null;

        bike = new Bike(askPlate(), askBrand(), askColor());


        return bike;
    }


    private static List<Wheel> createFinalWheel() throws Exception {
        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < ONE_WHEEL; i++) {
            wheels.add(createWheel());
        }
        return wheels;
    }

    private static List<Wheel> createTwoWheel() throws Exception {

        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < TWO_WHEELS; i++) {
            wheels.add(createWheel());
        }
        return wheels;
    }

    private static Wheel createWheel() throws Exception {
        return new Wheel(askBrandWheel(), askDiameterWheel());
    }

    private static double askDiameterWheel() {
        System.out.println("Write the diameter of the wheel");
        return new Scanner(System.in).nextDouble();
    }

    private static String askBrandWheel() {
        System.out.println("Write the brand of the wheel");
        return new Scanner(System.in).nextLine();
    }

    private static Car createCar() throws Exception {
        Car car = null;

        car = new Car(askPlate(), askBrand(), askColor());


        return car;
    }

    private static String askColor() {
        System.out.println("Write the color of your vehicle");
        return new Scanner(System.in).nextLine();
    }

    private static String askBrand() {
        System.out.println("Write the brand of your vehicle");
        return new Scanner(System.in).nextLine();
    }

    private static String askPlate() {
        System.out.println("Write the plate of your vehicle");
        return new Scanner(System.in).nextLine();
    }
}
