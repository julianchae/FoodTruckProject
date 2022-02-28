package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String name = "";
	private String type = "";
	private double rating = 0.0;
	int truckId = 0;
	
	
	public FoodTruck() {

	}

	public FoodTruck(String name, String type, double rating, int truckId) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		String output = " Name = " +name+ " Type of food = "+type+" Rating = "+rating;
		return output;
	}
	
	
	public static void truckId(String name) {

		          
		
		
	}
	
	
}


