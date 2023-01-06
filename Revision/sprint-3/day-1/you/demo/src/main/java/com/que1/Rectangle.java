package com.que1;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
private int l;
private int b;
public Rectangle(int l,int b) {
	this.l=l;
	this.b=b;
	
}
public void area() {
	System.out.println("Area of rectangle is-"+l*b);
}
public void perimeter() {
	System.out.println("Perimeter of rectangle-"+2*(l+b));
}
public void draw() {
	System.out.println("Rectangle is drwan");
}

}
