package com.qa.Garage;

import java.util.List;
import java.util.ArrayList;

public class Garage {

	List<Vehicle> myList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle v) {

		myList.add(v);

	}

	public void removeVehicle(Vehicle v) {
		myList.remove(v);
	}
	
	public void emptyGarage() {
		myList.clear();
	}
	


	@Override
	public String toString() {
		return "Garage [myList=" + myList + "]";
	}

	public void bill(Vehicle V) {
		for(Vehicle i : myList) {
			if(i.getCost()>=40000.0) {
				Double total = i.getCost() *1.2;
				i.setCost(total);
			}
			else {
				Double total = i.getCost() * 0.8;
				i.setCost(total);
			}
		}

	}
}