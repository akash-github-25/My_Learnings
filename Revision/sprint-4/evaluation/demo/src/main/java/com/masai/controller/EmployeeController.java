package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService es;
	
	@PostMapping("/api/Employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)throws EmployeeException {
	
		Employee x=es.addEmployee(employee);
		
		return new ResponseEntity<Employee>(x, HttpStatus.CREATED);
	}
	
	@GetMapping("/api/get-employees/{employeeId}")
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable("employeeId") Integer employeeId)throws EmployeeException{
		Employee employee=es.getEmployee(employeeId);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/api/get-employee-Manager/{employeeId}")
	public ResponseEntity<Employee> getMnanagebyId(@PathVariable("employeeId") Integer employeeId)throws EmployeeException{
		Employee employee=es.getEmployeeManager(employeeId);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/api/get-all-reportee/{employeeId}")
	public ResponseEntity<Employee[]> getReporteebyId(@PathVariable("employeeId") Integer employeeId)throws EmployeeException{
		Employee[] employee=es.getEmployeeReportee(employeeId);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	

}

