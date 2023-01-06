package com.que1;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;
	
	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}

	public Car() {
		super();
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
