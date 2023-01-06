package com.question1;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;
		if((isRaining)||(isSnowing)||(temperature<50)) {
			System.out.println("Let’s stay home.");
		}else {
			System.out.println("Let’s go out!");
		}

	}

}
