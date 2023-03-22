package com.qa.garage.vehicle;

public abstract class Vehicle {

	private int numWheels;

	private String colour;

	public final int id = count;

	public static int count = 1;

	public Vehicle(int numWheels, String colour) {
		super();
		this.numWheels = numWheels;
		this.colour = colour;
		count++;
	}

	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

}
