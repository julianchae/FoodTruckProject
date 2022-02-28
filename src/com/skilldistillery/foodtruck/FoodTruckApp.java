package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		FoodTruck[] foodtrucks = new FoodTruck[5];

		System.out.println("Enter up to 5 food trucks and their information. ");

		double numberOfTrucks = 0;
		for (int i = 0; i < foodtrucks.length; i++) {

			System.out.println("Enter name of food truck (Enter quit to stop entering trucks) : ");

			String name = kb.nextLine();

			if (name.equalsIgnoreCase("quit")) {

				break;

			} else {
//				foodtrucks[i].setName(name);
//
				System.out.println("Enter the type of food served: ");
				String type = kb.nextLine();
//
//				foodtrucks[i].setType(kb.nextLine());
//
				System.out.println("Enter your rating for this food truck (1-10): ");
//
				double rating = kb.nextDouble();
//				foodtrucks[i].setRating(kb.nextDouble());
//
				kb.nextLine();
				foodtrucks[i] = new FoodTruck(name, type, rating);
			}
			numberOfTrucks++;

		}

		boolean menu = true;
		while (menu) {
			System.out.println("Please choose from the following options(Enter 1-4) : ");
			System.out.println("1. List of food trucks entered.");
			System.out.println("2. Average rating of all the food trucks.");
			System.out.println("3. Highest rated food truck.");
			System.out.println("4. Quit.");

			int choice = kb.nextInt();

			switch (choice) {

			case 1:
				
				int i;
				
				for (i = 0; i < foodtrucks.length; i++) {
					
					if (foodtrucks[i] == null) {
						
						break;
					}
					System.out.println(foodtrucks[i].toString());
				}
				break;

			case 2:
				double sum = 0;
				
				double avg = 0;
				
				for (i = 0; i < foodtrucks.length; i++) {

					if (foodtrucks[i] == null) {
						break;
					}
					sum += foodtrucks[i].getRating();
					
					avg = (sum / numberOfTrucks);
				}
				System.out.println("The average rating of your food trucks are " + avg);
				
				break;

			case 3:
				double highest = foodtrucks[0].getRating();
				
				int count = 0;
				
				for (i = 0; i < foodtrucks.length; i++) {
					
					if (foodtrucks[i] == null) {
						
						break;
					}
					if (foodtrucks[i].getRating() > highest) {
						
						highest = foodtrucks[i].getRating();
						
						count = i;
					}

				}
				System.out.println("Your highest rated food truck is " + foodtrucks[count].toString());
				break;

			case 4:

				System.out.println("Thank you for your input. Have a good day.");
				menu = false;

				kb.close();
			}

		}
	}
}