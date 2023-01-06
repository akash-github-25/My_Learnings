package com.que4;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;





@Controller(value = "isuc")
public class InsertStudentUseCase {
	@Value("${db.name}")
	String name;
	@Value("${db.marks}")
	int marks;
	@Autowired
	private StudentService sService;
	
	
	public void insertStudent() {
	
		Scanner sc= new Scanner(System.in);
		

		
		Student student = new Student();
		student.setName(name);
		student.setMarks(marks);
		
		
	 	String result= sService.saveStudent(student);
		
	 	System.out.println(result);
	
	}
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 InsertStudentUseCase obj= ctx.getBean("isuc",InsertStudentUseCase.class);
		
		 obj.insertStudent();
		
	}
	
	
}
