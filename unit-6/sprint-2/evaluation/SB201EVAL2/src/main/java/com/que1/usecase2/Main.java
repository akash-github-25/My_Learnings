package com.que1.usecase2;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Entity.Address;
import com.que1.Entity.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpName("akash");
		e.setSalary(100);
		e.setAddress(new Address("del","mp",77117));
		
		EmployeeDao e1=new EmployeeDaoImpl();
		e1.addEmployee(e);
		
	}

}
