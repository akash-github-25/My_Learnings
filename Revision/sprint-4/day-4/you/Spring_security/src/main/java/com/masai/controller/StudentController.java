package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.StudentException;
import com.masai.bean.Course;
import com.masai.bean.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	@Autowired
private StudentService ss;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) throws StudentException {
		Student student1=ss.addStudent(student);
		
	     return student1;
		
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable("studentId") Integer studentId) throws StudentException {
		Student stud=ss.findStudent(studentId);
		return stud;
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudents() throws StudentException{
//		List<Student> studs=ss.findallStudent();
		List<Student> d=new ArrayList<>();
		List<Course> c=new ArrayList<>();
		d.add(new Student(1,"ak","ak@24",c));
		return d;
	}
	
	@DeleteMapping("/delete/{studentId}")
	public Student deleteStudent(@PathVariable("studentId") Integer studentId) throws StudentException {
		Student stud=ss.removeStudent(studentId);
		return stud;
	}
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) throws StudentException {
		Student stud=ss.updateStudent(student);
		return stud;
	}
}
