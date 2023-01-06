package com.masai.bean;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	 @Autowired
	public EmployeeRepo er;

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee s=er.save(employee);
		return s;
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> emp=er.findAll();
		return emp;
	}

	@Override
	public Employee getEmployee(Integer EmployeeId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> employee=er.findById(EmployeeId);
		Employee emp=employee.get();
		return emp;
	}

	@Override
	public Employee deleteEmployee(Integer EmployeeId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> employee=er.findById(EmployeeId);
		Employee emp=employee.get();
	    er.delete(emp);
		return null;
	}

}
