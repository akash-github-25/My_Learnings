package com.que4;

public class Circle implements Shape{
private int radius;

	public Circle(int radius) {
	super();
	this.radius = radius;
}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("You have drawn Circle");
		System.out.println("Radius-"+radius);
	}

}
