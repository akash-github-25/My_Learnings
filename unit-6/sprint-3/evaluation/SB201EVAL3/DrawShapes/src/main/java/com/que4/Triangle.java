package com.que4;

public class Triangle implements Shape {
	 private int side ;
	 
		public void setSide(int side) {
		this.side = side;
	}

		@Override
		public void draw() {
			System.out.println("You have drawn Traingle");
			System.out.println("Side is :"+side);
			System.out.println("=================================");
			
		}
}
