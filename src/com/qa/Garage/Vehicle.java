package com.qa.Garage;

public class Vehicle {

	String colour;
	int Year;
	int Wheels;
	String Make;
	double Cost;

	public double getCost() {
		return Cost;
	}

	public void setCost(double d) {
		Cost = d;
	}

	public Vehicle(String colour, int year, int wheels, String make, int cost) {
		super();
		this.colour = colour;
		Year = year;
		Wheels = wheels;
		Make = make;
		Cost = cost;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getWheels() {
		return Wheels;
	}

	public void setWheels(int wheels) {
		Wheels = wheels;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", Year=" + Year + ", Wheels=" + Wheels + ", Make=" + Make + ", Cost="
				+ Cost + "]";
	}

}
