package com.masai.usecase1;

import java.util.Scanner;

import com.masai.Entities.Employee;
import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee acc1=new Employee();
		System.out.println("Give name");
		String name=sc.next();
		acc1.setName(name);
		System.out.println("Give address");
		String add=sc.next();
		acc1.setAddress(add);
		System.out.println("Give Salary");
		int sal=sc.nextInt();
		acc1.setSalary(sal);

		
		
		try {
			Employee f= dao.registerEmployee(acc1);
			System.out.println(f+" Employee registered");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		

	}

}
