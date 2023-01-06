package com.que3;

public class Main {
	
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		Employee E=new Employee();
		Manager M=new Manager();
		Member x=new Member();
		
		E.Name="akash";
		E.Age=10;
		E.PhoneNumber="7980960742";
		E.Address="tonmayApartment";
		E.Salary=200;
//		x.printSalary(E.Name,E.Salary);
		
		
		System.out.println("Name "+E.Name);
		System.out.println("Age "+E.Age);
		System.out.println("PhoneNumber "+E.PhoneNumber);
		System.out.println("Address "+E.Address);
		System.out.println("Salary "+E.Salary);
		x.printSalary(E.Name,E.Salary);
		
		M.Name="ayush";
		M.Age=5;
		M.PhoneNumber="7980960789";
		M.Address="tonmayApartment";
		M.Salary=10000;
		
		System.out.println("Name "+M.Name);
		System.out.println("Age "+M.Age);
		System.out.println("PhoneNumber "+M.PhoneNumber);
		System.out.println("Address "+M.Address);
		System.out.println("Salary "+M.Salary);
		x.printSalary(E.Name,E.Salary);

	}

}
