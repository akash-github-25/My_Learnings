package com.que1.usecase1;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que1.Entity.Collage;
import com.que1.Entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		Collage c=new Collage();
		c.setCollageAddress("Kolkata");
		
		c.setCollageName("cmc");
		
		Student s1=new Student();
		s1.setEmail("ak@25");
		s1.setMobileNumber(789);
		s1.setStudentName("akash");
		s1.setDept(c);
		
		Student s2=new Student();
		s2.setEmail("ay@19");
		s2.setMobileNumber(778);
		s2.setStudentName("ayush");
		s2.setDept(c);
		
		Student s3=new Student();
		s3.setEmail("ab@23");
		s3.setMobileNumber(7809);
		s3.setStudentName("abhishek");
		s3.setDept(c);
		
		Student s4=new Student();
		s4.setEmail("su@01");
		s4.setMobileNumber(789098);
		s4.setStudentName("subham");
		s4.setDept(c);
		
		c.getEmps().add(s1);
		c.getEmps().add(s2);
		c.getEmps().add(s3);
		c.getEmps().add(s4);
		
		Collage c1=new Collage();
		c1.setCollageAddress("Mumbai");
		c1.setCollageName("mmc");
		
		Student sa1=new Student();
		sa1.setEmail("ak@47");
		sa1.setMobileNumber(89677);
		sa1.setStudentName("akchay");
		sa1.setDept(c1);
		
		Student sa2=new Student();
		sa2.setEmail("ayshi@19");
		sa2.setMobileNumber(7788);
		sa2.setStudentName("ayushi");
		sa2.setDept(c1);
		
		Student sa3=new Student();
		sa3.setEmail("ab@87");
		sa3.setMobileNumber(70988);
		sa3.setStudentName("abhinav");
		sa3.setDept(c1);
		
		Student sa4=new Student();
		sa4.setEmail("kr@01");
		sa4.setMobileNumber(78989);
		sa4.setStudentName("krishna");
		sa4.setDept(c1);
		
		c1.getEmps().add(sa1);
		c1.getEmps().add(sa2);
		c1.getEmps().add(sa3);
		c1.getEmps().add(sa4);
		
		

		em.getTransaction().begin();
		
		em.persist(c);
		em.persist(c1);
		
		em.getTransaction().commit();	
			

		

		
		
		em.close();
		

	}

}
