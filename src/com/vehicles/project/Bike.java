package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle{

	public Bike(String plate, String brand, String color) throws Exception{
		super(plate, brand, color);
	}
	public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception {
		addOneWheel(frontWheel);
		addOneWheel(backWheel);
	}

	public void addOneWheel(Wheel wheel)  {
		this.wheels.add(wheel);
	}


}
