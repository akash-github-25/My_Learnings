package com.Question;

import java.util.List;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public boolean deleteEmployee(int empId)throws EmployeeNotExist;
	public List<Employee> getAllEmployees();
	public Employee get(int empId);
}
