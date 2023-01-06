package com.Question;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> emp=new ArrayList<>();

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee==null) {
			return null;
		}
		Boolean e=emp.add(employee);
		if(e) {
			return employee;
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeNotExist {
		// TODO Auto-generated method stub
		int z=0;
		for(Employee v:emp) {
			if(v.getEmployeeId()==empId) {
				emp.remove(v);
				z=1;
				return true;
			}
		}
		if(z==0) {
			throw new EmployeeNotExist("Employeee not present");
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
	  return emp;
	}

	@Override
	public Employee get(int empId) {
		// TODO Auto-generated method stub
		for(Employee v:emp) {
			if(v.getEmployeeId()==empId) {
				
				return v;
			}
		}
		return null;
	}

}
