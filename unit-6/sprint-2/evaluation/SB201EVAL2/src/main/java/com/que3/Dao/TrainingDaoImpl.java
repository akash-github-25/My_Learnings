package com.que3.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que1.Entity.Department;
import com.que1.Entity.Employee;
import com.que3.Entity.Course;
import com.que3.Entity.Student;
import com.que3.Entity.Teacher;
import com.que3.Exception.CourseException;
import com.que3.Exception.TeacherException;

public class TrainingDaoImpl implements TrainingDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		
Course c=em.find(Course.class,courseId);
student.getCou().add(c);
em.getTransaction().begin();
em.persist(student);
em.getTransaction().commit();
em.close();
		
		
		
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(teacher);
		em.getTransaction().commit();
		
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		

		
		
		
		Teacher emp=  em.find(Teacher.class, teacherId);
		Course dep=  em.find(Course.class, courseId);
	    dep.setTech(emp);
		emp.getTech().add(dep);
		
		
				
				em.getTransaction().begin();
				
				em.persist(dep);
				
				em.getTransaction().commit();
				em.close();
				System.out.println("done");
				
				
			}
		
	

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

}
