package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.StudentException;
import com.masai.bean.Student;
import com.masai.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
	private StudentRepo sr;
    
	@Override
	public Student addStudent(Student student) throws StudentException {
		Student stud=sr.save(student);
		if(stud!=null) {
		return stud;
		}else {
			throw new StudentException("Student can't be added");
		}
	}

	@Override
	public Student removeStudent(Integer studentID) throws StudentException {
		Student stud=sr.findById(studentID).get();
		if(stud!=null) {
		sr.delete(stud);
		return stud;
		}else {
			throw new StudentException("Student not present to delete");
		}
		
	}

	@Override
	public Student findStudent(Integer studentID) throws StudentException {
		Student stud=sr.findById(studentID).get();
		if(stud!=null) {
		return stud;
		}else {
			throw new StudentException("Student not present with this id");
		}
	}

	

	@Override
	public Student updateStudent(Student student) throws StudentException {
		Student x=sr.save(student);
		return x;
	}

	@Override
	public List<Student> findallStudent() throws StudentException {
		List<Student> stud=sr.findAll();
		if(stud.size()!=0) {
		return stud;
		}else {
			throw new StudentException("Students not present");
		}
	}

}
