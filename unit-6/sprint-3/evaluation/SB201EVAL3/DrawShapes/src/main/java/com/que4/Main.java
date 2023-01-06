package com.que4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape cr = ctx.getBean(Circle.class,"cl");
		cr.draw();
		Shape tr = ctx.getBean(Triangle.class,"t");
		tr.draw();
		Shape cy = ctx.getBean(Cylinder.class,"cyd");
		cy.draw();
	}

}
