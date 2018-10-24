package com.cartable;

public class UsedCar extends Car {

	private double mileage;

	public UsedCar() {
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public UsedCar(double mileage) {
		super();
		this.mileage = mileage;
	}


	public UsedCar(String make, String model, int year, double price, int num) {
		super(make, model, year, price, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + String.format("(Used) " + mileage + " Miles");
	}

}
