package com.que2.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que2.Entity.Course;
import com.que2.Entity.Student;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		
		Course d=em.find(Course.class, 1);
		List<Student> st=d.getStud();
		for(Student x:st) {
			System.out.println("****************************");
			System.out.println("Name "+x.getName());
			System.out.println("Email "+x.getEmail());
			System.out.println("Mobile "+x.getMobile());
			System.out.println("Roll "+x.getRoll());
			System.out.println("****************************");
		}
		
		em.close();

	}

}
