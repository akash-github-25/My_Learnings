package com.que1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("give no f passengedr");
		int numberOfPassenger=sc.nextInt();
		System.out.println("give no of kms");
		HatchBack c=new HatchBack();
		c.setNumberOfKms(sc.nextInt());
		int numberOfKms=c.getNumberOfKms();
//		System.out.println(numberOfKms+"scan");
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is "+ res);
	}

}
