package com.que1.usecase4;

import java.util.List;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Entity.Employee;
import com.que1.Exception.EmployeeException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao s=new EmployeeDaoImpl();
		try {
			List<Employee> v=s.getAllEmployeeWithDeptName("operations");
			for(Employee x:v) {
				System.out.println(x);
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
