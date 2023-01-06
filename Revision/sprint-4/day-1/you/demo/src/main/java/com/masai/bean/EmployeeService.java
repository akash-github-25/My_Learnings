package com.masai.bean;

import java.util.List;

public interface EmployeeService {
	
public Employee addEmployee(Employee employee)throws EmployeeException;
public List<Employee> getAllEmployee()throws EmployeeException;
public Employee getEmployee(Integer EmployeeId)throws EmployeeException;
public Employee deleteEmployee(Integer EmployeeId)throws EmployeeException;

}
