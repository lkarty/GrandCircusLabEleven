package com.cartable;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Car> carList = new ArrayList<>();

		System.out.println("How many cars are you entering?");
		int usrCarNum = scan.nextInt();
		scan.nextLine();

		Car[] cars = new Car[usrCarNum];


		for (int i = 0; i < usrCarNum; i++) {
			int num = i + 1;
			String make = Validator.getString(scan, "Enter Car # " + num + " Make: ");
			String model = Validator.getString(scan, "Enter Car # " + num + " Model: ");
			// create validator method for date
			int year = Validator.getInt(scan, "Enter Car # " + num + " Year: ");
			double price = Validator.getDouble(scan, "Enter Car # " + num + " Price: ");
			carList.add(new Car(make, model, year, price, num));
		}

		UsedCar uc1 = new UsedCar("Ferd", "Stolen Ride", 2017, 212.22, 4);
		uc1.setMileage(11111);
		carList.add(uc1);

		UsedCar uc2 = new UsedCar("Chryslur", "Burner", 2017, 1.22, 5);
		uc2.setMileage(58008);
		carList.add(uc2);

		UsedCar uc3 = new UsedCar("Doge", "Shiba", 2017, 7777.77, 6);
		uc3.setMileage(88888);
		carList.add(uc3);


		System.out.println("\nCurrent Inventory:");

		for (Car car : carList) {
			System.out.print(car.getNum() + ". ");
			if (car instanceof Car) {
			System.out.println(car);
			} else if (car instanceof UsedCar) {
				System.out.println(car);
			}
		}
		


		System.out.println("Which Car would you like?");
		int choice = scan.nextInt();
		
		for (Car car : carList) {
			if (choice == car.getNum()) {
				carList.remove(choice);
			}
		} 

		System.out.println(carList.toString());




	}

}
