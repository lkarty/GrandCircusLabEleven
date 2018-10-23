package com.cartable;

public class Car {


	private String make;
	private String model;
	private int year;
	private double price;
	private int num;


	public Car() {

	}

	public Car(String make, String model, int year, double price, int num) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-20s  %-20s  %-20s", make, model, year, price);

		// return "Car [make=" + make + ", model=" + model + ", year=" + year + ",
		// price=" + price + "]";
	}


//	public void printCars() {
//		System.out.println("Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]");
//
//	}

}
