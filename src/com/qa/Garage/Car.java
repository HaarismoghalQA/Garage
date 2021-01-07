package com.qa.Garage;

public class Car extends Vehicle {

	String model;
	String enginesize;

	public Car(String colour, int year, int wheels, String make, int cost, String model, String enginesize) {
		super(colour, year, wheels, make, cost);
		this.model = model;
		this.enginesize = enginesize;
	}

	

	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getEnginesize() {
		return enginesize;
	}



	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}



	@Override
	public String toString() {
		return "Car [model=" + model + ", enginesize=" + enginesize + ", colour=" + colour + ", Year=" + Year
				+ ", Wheels=" + Wheels + ", Make=" + Make + ", Cost=" + Cost + "]";
	}
	
	
}
