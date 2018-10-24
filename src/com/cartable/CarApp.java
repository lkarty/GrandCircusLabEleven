package com.cartable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int curryear = Calendar.getInstance().get(Calendar.YEAR);

		ArrayList<Car> carList = new ArrayList<>();

		System.out.println("How many cars are you entering?");
		int usrCarNum = scan.nextInt();
		scan.nextLine();

		Car[] cars = new Car[usrCarNum];

		for (int i = 0; i < usrCarNum; i++) {
			int num = i + 1;
			String make = Validator.getString(scan, "Enter Car # " + num + " Make: ");
			String model = Validator.getString(scan, "Enter Car # " + num + " Model: ");
			int year = Validator.getInt(scan, "Enter Car # " + num + " Year: ", 1885, curryear);
			double price = Validator.getDouble(scan, "Enter Car # " + num + " Price: ", 0, Integer.MAX_VALUE);
			carList.add(new Car(make, model, year, price, num));
		}

		UsedCar uc1 = new UsedCar("Ferd", "Stolen Ride", 2017, 212.22, usrCarNum + 1);
		uc1.setMileage(11111.2);
		carList.add(uc1);

		UsedCar uc2 = new UsedCar("Chryslur", "Burner", 2017, 1.22, usrCarNum + 2);
		uc2.setMileage(58008);
		carList.add(uc2);

		UsedCar uc3 = new UsedCar("Doge", "Shiba", 2017, 7777.77, usrCarNum + 3);
		uc3.setMileage(88888.8);
		carList.add(uc3);

		boolean quit = true;
		int menutotal = usrCarNum + 4;

		do {
			quit = false;
			System.out.println("\nCurrent Inventory:");

			for (Car car : carList) {
				System.out.print(carList.indexOf(car) + 1 + ". ");
				if (car instanceof Car) {
					System.out.println(car);
				} else if (car instanceof UsedCar) {
					System.out.println(car);
				}
			}
			System.out.println(menutotal + ". Quit");

			int choice = Validator.getInt(scan, "\nWhich Car would you like? ", 1, menutotal);

			if (choice == menutotal) {
				System.out.println("Have a great day!");
				break;

			} else {
				String selectCar = Validator.getString(scan, "Would you like to purchase this car? y/n ");

				System.out.println(carList.get(choice - 1));

				if (selectCar.equalsIgnoreCase("y")) {
					System.out.println("Excellent! our finance department will be in touch shortly.\n");
					carList.remove(choice - 1);
					menutotal--;
				} else if (selectCar.equalsIgnoreCase("n")) {
					System.out.println("Have a great day!");
					break;
				}
			}

		} while (quit == false);
	}

}
