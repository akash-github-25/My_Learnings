package com.que4;

public class BlueCar extends Car{
	{
		System.out.print("4");
		}
		public BlueCar() {
		super("blue");
		System.out.print("5");
		}
		public static void main(String[] gears) {
		new BlueCar();
		}
// So every time the static method is going to be executed 1st and the constructor is
//		executed at the last.
		
//		13245----is the required answer.
		
}
