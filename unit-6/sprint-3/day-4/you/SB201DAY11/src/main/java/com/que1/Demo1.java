package com.que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
		A a1= ctx.getBean("a", A.class);
		
		a1.funA();
		a1.funB();
		
		 ((AnnotationConfigApplicationContext)ctx).close();
	}

}
