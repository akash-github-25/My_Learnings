package com.que1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AppRunner {
	
	
	private Shape s;
	
//	public AppRunner() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

   @Autowired
	public AppRunner(Shape s) {
		this.s=s;
		// TODO Auto-generated constructor stub
	}


//	public void setS(Shape s) {
//		this.s = s;
//	}

public void run() {
    ShapeDrawer s1=new ShapeDrawer(s);
	ShapeAreaCalculator se=new ShapeAreaCalculator(s);
	s1.draw();
	se.Area();
}
}
