package com.que2.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que2.Entity.Course;
import com.que2.Entity.Student;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		
		Student d=em.find(Student.class, 2);
		List<Course> st=d.getCo();
		for(Course x:st) {
			System.out.println("****************************");
			System.out.println("Course_id "+x.getCourseId());
			System.out.println("Course_Name "+x.getCourseName());
			System.out.println("Course_Duration "+x.getDuration());
			System.out.println("Course_Fees "+x.getFee());
			System.out.println("****************************");
		}
		
		em.close();

	}

}
