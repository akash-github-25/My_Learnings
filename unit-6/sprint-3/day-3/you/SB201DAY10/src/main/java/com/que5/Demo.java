package com.que5;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	
	public void myInit(){
	System.out.println("inside myInit method");
	}
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	public void cleanUp(){
	System.out.println("inside cleanUp method");
	}
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		//print all the details of all the employees department-wise.
		for(Map.Entry<Department, Employee> v:theMap.entrySet()) {
			System.out.println("Department is "+v.getKey());
			System.out.println("EmployeeName is "+v.getValue());
			System.out.println("***************************************");
		}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo a1 = ctx.getBean("d",Demo.class);
		a1.showDetails();
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();



	}

}
