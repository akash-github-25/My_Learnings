package com.Question;

import java.util.List;

public class AppRunner {
	
	public static EmployeeService es=new EmployeeServiceImpl();
	public static void main(String[] args) throws EmployeeNotExist {
		// TODO Auto-generated method stub
			es.addEmployee(new Employee(1,"akash","belur"));
		es.addEmployee(new Employee(2,"ayush","belur"));
		es.addEmployee(new Employee(3,"anku","belur"));
		es.addEmployee(new Employee(4,"ashu","belur"));
		
		List<Employee> c=es.getAllEmployees();
		for(Employee x:c) {
			System.out.println(x);
		}
		
		es.deleteEmployee(1);
		
		List<Employee> c1=es.getAllEmployees();
		for(Employee x:c1) {
			System.out.println(x);
		}

	}

}
