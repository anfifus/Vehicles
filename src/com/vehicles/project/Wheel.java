package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkBrand(brand);
		checkDiameter(diameter);
		this.brand = brand;
		this.diameter = diameter;
	}

	private void checkDiameter(double diameter) throws Exception{
		if (diameter < 0.4 || diameter > 4) throw new Exception("Your wheels don't have the correct size");
	}

	private void checkBrand(String brand) throws Exception {
		if (brand == null || brand.equals("")) throw new Exception("Must put a brand");
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj) return true;
		if(!(obj instanceof Wheel)) return false;

		Wheel newWheel = (Wheel) obj;

		if(!brand.equals(newWheel.brand) && diameter != newWheel.diameter)	return false;

		return true;
	}

	public String getBrand() {
		return brand;
	}

	public double getDiameter() {
		return diameter;
	}
}
