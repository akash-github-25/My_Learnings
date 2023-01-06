package com.que3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 Travel obj= ctx.getBean("travel",Travel.class);
		
		obj.funk();
		((AnnotationConfigApplicationContext)ctx).close();
	}

}
