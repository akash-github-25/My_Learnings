package com.que1.usecase1;

import java.util.Scanner;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Entity.Address;
import com.que1.Entity.Department;
import com.que1.Entity.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department();
		d1.setDeptName("operations");
		d1.setLocation("delhi");
		

		
		EmployeeDao e=new EmployeeDaoImpl();
		e.addDepartment(d1);
		
		
		
		
		

	}

}
