package com.qa.garage;

import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		System.out.println(g);

//		g.removeByType("car");
		for (Vehicle v : g.getArray()) {
			System.out.println(v.getId());
		}

		Scanner newScanner = new Scanner(System.in);
		String userIn = newScanner.nextLine();
		System.out.println(userIn);
		newScanner.close();

		try {
			System.out.println(g.findByID(6));
		} catch (ExcepetionHandlingGarage e) {
			System.out.println(e);
		}

	}

}
