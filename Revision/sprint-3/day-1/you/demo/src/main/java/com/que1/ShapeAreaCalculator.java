package com.que1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeAreaCalculator {
	
	private Shape c;
	@Autowired
	public ShapeAreaCalculator(Shape c) {
		this.c=c;
		// TODO Auto-generated constructor stub
	}
	
public void Area() {
	c.area();
	c.perimeter();
}
}
