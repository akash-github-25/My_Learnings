package com.que4;

abstract class Car {
	
	{
		System.out.print("1");
		}
	
		public Car(String name) {
		super();
		System.out.print("2");
		}
		
		static {
		System.out.print("3");
		}
		

}
