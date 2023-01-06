package com.que1;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{
	private int r;
	public Square(int r) {
		this.r=r;
		// TODO Auto-generated constructor stub
	}
  public void area() {
	  System.out.println("area of Square is-"+r*r);
  }
  public void perimeter() {
	  System.out.println("Perimeter of Square is"+(4*r));
  }
  public void draw() {
	  System.out.println("Square is drawn");
  }
}
