package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Car BMW = new Car("Yellow", 2015, 4, "BMW", 45000, "M4", "4L");
		Motorcycle Yahmaha = new Motorcycle("Black", 2019, 2, "Yahmaha", 35000, "2,300");
		Truck Renault = new Truck("White", 2010, 16, "Renault", 50000, "5.5L");

		Garage g = new Garage();

		g.addVehicle(BMW);
		g.addVehicle(Yahmaha);
		g.addVehicle(Renault);
		
		System.out.println(g.toString());
		
		g.removeVehicle(Renault);
		
		System.out.println(BMW.toString());
		
		g.bill(BMW);
		g.bill(Yahmaha);
		g.bill(Renault);
		
		System.out.println(BMW.getCost());
		System.out.println(Yahmaha.getCost());
		System.out.println(Renault.getCost());
		
		g.emptyGarage();
		
		
		System.out.println(g.toString());
		
		

	}

}
