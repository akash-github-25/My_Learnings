package com.masai.usecase3;

import java.util.Scanner;

import com.masai.Entities.Employee;
import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid");
		int i=sc.nextInt();
		try {
			Employee e=dao.deleteEmployeeById(i);
			System.out.println(e+"  is deleted from table");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
