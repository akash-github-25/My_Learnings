package com.que1;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	private int r;
	public Circle(int r) {
		this.r=r;
		// TODO Auto-generated constructor stub
	}
  public void area() {
	  System.out.println("area of circle is-"+(22/7)*r*r);
  }
  public void perimeter() {
	  System.out.println("Perimeter of Circle is"+(44/7)*r);
  }
  public void draw() {
	  System.out.println("Circle is drawn");
  }
}
