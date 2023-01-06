package com.masai.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService es;
	
	@PostMapping("/employee")
public Employee addEmployee(@RequestBody Employee employee) throws EmployeeException {
		Employee s=es.addEmployee(employee);
	return s;
}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() throws EmployeeException{
		List<Employee> employees=es.getAllEmployee();
		return employees;
	}
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer Id) throws EmployeeException {
		return es.getEmployee(Id);
	}
	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable("id") Integer Id) throws EmployeeException {
		Employee s=es.deleteEmployee(Id);
		return s;
		
	}
}
