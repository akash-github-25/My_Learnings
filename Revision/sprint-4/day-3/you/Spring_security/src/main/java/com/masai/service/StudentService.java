package com.masai.service;

import java.util.List;

import com.masai.Exception.StudentException;
import com.masai.bean.Student;

public interface StudentService {
	
public Student addStudent(Student student) throws StudentException;
public Student removeStudent(Integer studentID) throws StudentException;
public Student findStudent(Integer studentID) throws StudentException;
public List<Student> findallStudent()throws StudentException;
public Student updateStudent(Student student)throws StudentException;

}

