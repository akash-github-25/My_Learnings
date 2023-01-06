package com.que3.Dao;

import java.util.List;

import com.que3.Entity.Course;
import com.que3.Entity.Student;
import com.que3.Entity.Teacher;
import com.que3.Exception.CourseException;
import com.que3.Exception.TeacherException;

public interface TrainingDao {
	 public void addCourse(Course course);
	 public void registerStudent(Student student, int courseId)throws CourseException;
	 public void registerTeacher(Teacher teacher);
	 public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;
	 List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;
	

	 
     
	 
	
}
