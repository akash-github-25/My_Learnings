package com.que1.Dao;

import java.util.List;

import com.que1.Entity.Department;
import com.que1.Entity.Employee;
import com.que1.Exception.DepartmentException;
import com.que1.Exception.EmployeeException;

public interface EmployeeDao {
	public void addDepartment(Department dept);
	 public void addEmployee(Employee emp);
	 public void registerEmployeeTODepartment(int empId, int deptId)throws  EmployeeException, DepartmentException;
	 List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	 Department getDepartmentDetailsByEmployeeId(int empId)throws  DepartmentException;
	
	 
	



}
