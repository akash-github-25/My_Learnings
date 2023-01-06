package com.masai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.beans.Employee;

@RestController
public class EmployeeController {
@GetMapping("/employees")
public List<Employee> getAllEmployee(){
	return List.of(
			new Employee(1,"akash"),
			new Employee(2,"ayush"),
			new Employee(3,"ayush_akash")
			);
}
@GetMapping("/employees/1")
public Employee getEmployee() {
	return new Employee(1,"akash");
}
}
