package com.que1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeDrawer{
	private Shape s;
	
    @Autowired
	public ShapeDrawer(Shape s) {
		this.s=s;
	}
public void draw() {
s.draw();
}
}
