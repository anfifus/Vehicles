package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception{
		checkPlate(plate);
		checkBrand(brand);
		checkColor(color);

		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	private static String checkColor(String color) throws Exception {
		if (color == null || color.equals("")) throw new Exception("The color must have value");
		return color;
	}

	private static String checkBrand(String brand) throws Exception {
		if (brand == null || brand.equals("")) throw new Exception("The brand must have value");
		return brand;
	}

	private static String checkPlate(String plate) throws Exception {
		if (plate == null || plate.equals("")) throw new Exception("The plate must have value");
		if (!controlPlate(plate)) throw new Exception("The plate must have 4 numbers and two or three letters");
		return plate;
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
		if (contLetter != 2 && contLetter != 3) return false;

		return true;
	}

	public String getPlate() {
		return plate;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}
	//public abstract void addWheels(List<Wheel> frontWheels,List<Wheel>backWheels ) throws Exception;
	public abstract void addWheels(Wheel templateWheel ) throws Exception;
	/*protected void addTwoWheels(List<Wheel> backWheels) throws Exception{

		if (backWheels.size() != 2)
			throw new Exception("The wheels of the vehicle must have 2");

		Wheel rightWheel = backWheels.get(0);
		Wheel leftWheel = backWheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("The right wheel is different size or brand from the left wheel");

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}*/
	protected void addTwoWheels(Wheel templateWheels) throws Exception{

		/*if (backWheels.size() != 2)
			throw new Exception("The wheels of the vehicle must have 2");*/

		Wheel rightWheel = templateWheels;
		Wheel leftWheel = templateWheels;

		if (!rightWheel.equals(leftWheel))
			throw new Exception("The right wheel is different size or brand from the left wheel");

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}
	protected void addOneWheel(Wheel wheel)  {
		this.wheels.add(wheel);
	}
}
