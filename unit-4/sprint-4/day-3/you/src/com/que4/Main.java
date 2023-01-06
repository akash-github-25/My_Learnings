package com.que4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Collection<Employee> e=new ArrayList<>();
System.out.println("...Welcome to Employee Management System....\r\n"
		+ "");
boolean d4=true;
while(d4) {
	
	
	
	Department d=new Department();
System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
String s=sc.next();
if(s.equals("Y")) {
	System.out.println("Enter the Employee Id:");
	int i=sc.nextInt();
	System.out.println("Enter the Employee Name:");
	String s2=sc.next();
	System.out.println("Enter the Employee Salary:");
	int j=sc.nextInt();
	
	System.out.println("Enter the Department Id:\r\n"
			+ "");
	int k=sc.nextInt();
	d.setDepartmentId(k);
	System.out.println("Enter the Department Name:");
	String s1=sc.next();
	d.setDepartmentName(s1);
	Department d1=new Department(k,s1);
	Employee e1=new Employee(i,s2,j,d1);
//	System.out.println(e1.getEmployeeId());
	e1.setEmployeeId(i);
	e1.setEmployeeName(s2);
	e1.setEmployeeSalary(j);
	e1.setDepartment(d1);
	e.add(e1);
	System.out.println("Employee Details added successfully..");
}else {
	System.out.println("Enter the your choice\r\n"
			+ "1: Find Employee in Particular Department\r\n"
			+ "2: Remove Particular Employee\r\n"
			+ "3: Print Employees in All Departments");
	int x=sc.nextInt();
	if(x==1) {
		System.out.println("Enter the Department Id:\\r\\n");
		int p=sc.nextInt();
		for(Employee e1:e) {
			if(e1.getEmployeeId()==p) {
				System.out.println("Employee id "+e1.getEmployeeId());
				System.out.println("Employee salary "+e1.getEmployeeSalary());
				System.out.println("Employee Name "+e1.getEmployeeName());
				Department d1=e1.getDepartment();
				System.out.println("Department id "+d1.getDepartmentId());
				System.out.println("Department Name "+d1.getDepartmentName());
			}
		}
		System.out.println("Do you want to Exit: ? (Y/N)\r\n"
				+ "");
		String z=sc.next();
		if(z.equals("Y")) {
			System.out.println("Thank you---");
			d4=false;
		}
		
	}else if(x==3) {
		Employee e2=new Employee();
		for(Employee e1:e) {
			e2.setEmployeeId(e1.getEmployeeId());
			e2.setEmployeeName(e1.getEmployeeName());
			e2.setEmployeeSalary(e1.getEmployeeSalary());
			e2.setDepartment(e1.getDepartment());
			System.out.println(e2.toString());
		}
		System.out.println("Do you want to Exit: ? (Y/N)\r\n"
				+ "");
		String z=sc.next();
		if(z.equals("Y")) {
			System.out.println("Thank you---");
			d4=false;
		}
		
	}else if(x==2) {
		System.out.println("Remove by employee id");
		int h1=sc.nextInt();
		System.out.println("Department id ");
		int h2=sc.nextInt();
		
		for(Employee e1:e) {
			Department g=e1.getDepartment();
			if(e1.getEmployeeId()==h1 && g.getDepartmentId()==h1) {
				System.out.println(e1.getEmployeeName()+" is removed");
				e.remove(e1);
				break;
			}
		}
		System.out.println("Do you want to Exit: ? (Y/N)\r\n"
				+ "");
		String z=sc.next();
		if(z.equals("Y")) {
			System.out.println("Thank you---");
			d4=false;
		}
		
	}
}
	}

	}
}
