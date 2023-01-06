package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;


//@Controller
@RestController
public class MyController {

	
@RequestMapping("/hello")	
//@ResponseBody
public String myWelcomeService() {
	return "welcome to spring Boot";
}
//@RequestMapping("/getStudent")
//public Student getStudentHandler() {
//	Student student=new Student(10,"ram",780);
//	return student;
//}
@RequestMapping("/employee")
public Employee getEmployeeDetail() {
	Employee e=new Employee("akash",1);
	return e;
}
@RequestMapping("/employees")
 public List<Employee> getListEmployee(){
	 List<Employee> d=new ArrayList<>();
	 Employee e1=new Employee("akash1",1);
	 Employee e2=new Employee("akash2",2);
	 Employee e3=new Employee("akash3",3);
	 Employee e4=new Employee("akash4",4);
	 Employee e5=new Employee("akash5",5);
	 d.add(e1);
	 d.add(e2);
	 d.add(e3);
	 d.add(e4);
	 d.add(e5);
	return d;
 }

}
