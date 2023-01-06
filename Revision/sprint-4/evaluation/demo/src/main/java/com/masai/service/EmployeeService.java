package com.masai.service;

import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;

public interface EmployeeService {
	
public Employee addEmployee(Employee emp)throws EmployeeException;
public Employee getEmployee(Integer empId) throws EmployeeException;
public Employee getEmployeeManager(Integer empId)throws EmployeeException;
public Employee[] getEmployeeReportee(Integer empId)throws EmployeeException;

}
