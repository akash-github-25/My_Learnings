package com.que2.ans2;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtil.provideEntityManager();
		Customer c=new Customer();
		c.setEmail("ak@25");
		c.setMobileNumber(711227);
		c.setName("akash");
		
		c.getAddresses().add(new Address("kol","hwh","711206","Home"));
		c.getAddresses().add(new Address("kol1","hwh1","7112064","Office"));
		
		
		Customer c1=new Customer();
		c1.setEmail("ay@19");
		c1.setMobileNumber(710227);
		c1.setName("ayush");
		
		c1.getAddresses().add(new Address("kolata","cw","710206","Home"));
		c1.getAddresses().add(new Address("kolata1","hcwh1","7102064","Office"));
		
		
      em.getTransaction().begin();
		
		em.persist(c);
		em.persist(c1);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
	}

}
