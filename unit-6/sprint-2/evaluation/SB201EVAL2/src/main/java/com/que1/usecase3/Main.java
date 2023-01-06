package com.que1.usecase3;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Exception.DepartmentException;
import com.que1.Exception.EmployeeException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao e1=new EmployeeDaoImpl();
		try {
			e1.registerEmployeeTODepartment(10, 9);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
