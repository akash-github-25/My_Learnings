package com.que1.usecase3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.mysql.cj.Query;
import com.que1.Entity.Collage;
import com.que1.Entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		
		String jpql="select collageAddress,collageName from Collage where collageId=(select clg from Student where studentRoll=:v)";
		
TypedQuery<Object[]> tq= em.createQuery(jpql, Object[].class);
		
	 	tq.setParameter("v",4);
	 	
	 	Object[] or= tq.getSingleResult();
		
	 	
		
		
	 		
	 		 String Address= (String)or[0];
	 		 String Name= (String)or[1];
	 		
	 		 System.out.println("Name is "+Name);
	 		 System.out.println("Address is :"+Address);
	 			
		em.close();

//		em.close();

	}

}
