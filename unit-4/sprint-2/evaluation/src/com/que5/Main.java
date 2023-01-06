package com.que5;

import java.util.Scanner;

public class Main {
	static int pfPercentage;
	public static Employee getEmployeeDetails() {
		Employee E=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		E.setEmployeeId(sc.nextInt());
		System.out.println("Enter Name");
		E.setEmployeeName(sc.next());
		System.out.println("Enter salary");
		E.setNetSalary(sc.nextInt());
		System.out.println("Enter PF percentage: ");
		Main s=new Main();
		pfPercentage=sc.nextInt();
		
		return E;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s=getEmployeeDetails();
		System.out.println("Id"+s.getEmployeeId());
		System.out.println("Name"+s.getEmployeeName());
		System.out.println("Salary"+s.getSalary());
		Main f=new Main();
		int y=pfPercentage;
		Employee v=new Employee();
		v.calculateNetSalary(y);
		System.out.println("Net salary"+v.getNetSalary());
		
		

	}

}
