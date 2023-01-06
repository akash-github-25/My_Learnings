package com.que2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 TreeSet<Employee> t=new TreeSet<>(new Salarysort());
 for(int i=0;i<4;i++) {
	 
	 System.out.println("Give Emoloyee id ");
	 int x=sc.nextInt();
	 System.out.println("Give Employee name ");
	 String y=sc.next();
	 System.out.println("Give Employee Salary ");
	 int d=sc.nextInt();
	 Employee e=new Employee(x,y,d);
	 t.add(e);
 }
 
 for(Employee s:t) {
	 System.out.println("Employee id "+s.getEmpId());
	 System.out.println("Employee name "+s.getEmpName());
	 System.out.println("Employee salary "+s.getSalary());
	 System.out.println("..................................");
 }
 
	}

}
