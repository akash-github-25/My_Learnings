package com.que2.usecases;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que2.Entity.Course;
import com.que2.Entity.Student;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		
		Course c1=new Course();
		c1.setCourseName("Art");
		c1.setDuration(2);
		c1.setFee(1000);
		
		
		Course c2=new Course();
		c2.setCourseName("Polity");
		c2.setDuration(1);
		c2.setFee(1200);
		
		Student s1=new Student();
		s1.setName("akash");
		s1.setMobile(7112233);
		s1.setEmail("ak@25");
		s1.getCo().add(c1);
		

		Student s2=new Student();
		s2.setName("ayush");
		s2.setMobile(7112233);
		s2.setEmail("ay@19");
		s2.getCo().add(c2);
		s2.getCo().add(c1);
		
		c1.getStud().add(s1);
		c1.getStud().add(s2);
		
		c2.getStud().add(s2);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		
		

	}

}
