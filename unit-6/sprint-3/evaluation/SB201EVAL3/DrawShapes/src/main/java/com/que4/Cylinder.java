package com.que4;

public class Cylinder implements Shape {
private int radius;
private int height;

	public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("You have drawn Cylinder");
		System.out.println("radius- "+radius);
		System.out.println("height- "+height);
		
	}

}
