package com.qa.Garage;

public class Truck extends Vehicle {

	String enginesize;

	public Truck(String colour, int year, int wheels, String make, int cost, String enginesize) {
		super(colour, year, wheels, make, cost);
		this.enginesize = enginesize;
	}



	public String getEnginesize() {
		return enginesize;
	}



	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}



	@Override
	public String toString() {
		return "Truck [enginesize=" + enginesize + ", colour=" + colour + ", Year=" + Year + ", Wheels=" + Wheels
				+ ", Make=" + Make + ", Cost=" + Cost + "]";
	}
	
	

}
