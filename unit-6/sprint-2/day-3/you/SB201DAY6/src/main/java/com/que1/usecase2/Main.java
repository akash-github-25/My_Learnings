package com.que1.usecase2;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.mysql.cj.Query;
import com.que1.Entity.Collage;
import com.que1.Entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManager em=EMUtil.provideEntityManager();
			
		Collage d= em.find(Collage.class, 1);
		
		List<Student> emps= d.getEmps();
		
		emps.forEach(e ->{
			
			System.out.println(e.getEmail());
			System.out.println(e.getMobileNumber());
			System.out.println(e.getStudentName());
			System.out.println(e.getStudentRoll());
			System.out.println("**************************");
		});
		
		System.out.println("done...");
	}

}
