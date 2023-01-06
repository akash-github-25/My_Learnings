package com.que1.usecase5;

import java.util.List;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Entity.Department;
import com.que1.Entity.Employee;
import com.que1.Exception.DepartmentException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				EmployeeDao s=new EmployeeDaoImpl();
				try {
					Department d3=s.getDepartmentDetailsByEmployeeId(10);
					System.out.println("DepartmentName-"+d3.getDeptName());
					System.out.println("DepartmentId-"+d3.getDeptId());
					System.out.println("Location-"+d3.getLocation());
					
				} catch (DepartmentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
