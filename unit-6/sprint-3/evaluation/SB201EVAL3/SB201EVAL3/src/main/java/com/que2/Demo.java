package com.que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
@Controller
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService c=ctx.getBean("studentService",StudentService.class);
		c.printAppName();
		c.printMap();
		c.printList();
		
	}
	}



