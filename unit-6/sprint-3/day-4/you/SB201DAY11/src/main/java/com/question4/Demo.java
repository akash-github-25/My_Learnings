package com.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;


@Controller(value = "ddd")
public class Demo {
	
	@Autowired
	private StudentService sService;
	public void funA() {
		
		sService.saveStudent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 Demo obj= ctx.getBean("ddd",Demo.class);
		
		obj.funA();
	}

}
