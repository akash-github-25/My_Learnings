package com.masai.usecase4;

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
		
		System.out.println("Enter empid number");
		int ano=sc.nextInt();
		
		Employee acc=null;
		try {
			acc = dao.getEmployeeById(ano);
		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(acc == null)
			System.out.println("Employee does not exist..");
		else{
			
			
			System.out.println("Enter the salary to Deposit");
			int amt=sc.nextInt();
			
			acc.setSalary(acc.getSalary()+amt);
			
			try {
				Employee f =dao.updateEmployee(acc);
			 System.out.println(f);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
	}
	}

}
