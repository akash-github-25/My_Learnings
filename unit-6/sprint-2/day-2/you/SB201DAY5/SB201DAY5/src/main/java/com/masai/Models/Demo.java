package com.masai.Models;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.mysql.cj.Query;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em= EMUtil.provideEntityManager();
		
		//get all the Address of a Employee whose name is Ramesh
		Customer c=new Customer();
		c.setEmail("ak@25");
		c.setMobileNumber(711227);
		c.setName("akash");
		
		c.getAddresses().add(new Address("kol","hwh","711206","Home"));
		c.getAddresses().add(new Address("kol1","hwh1","7112064","Office"));
		c.getAddresses().add(new Address("kol2","hwh2","7112063","Tution"));
		
		Customer c1=new Customer();
		c1.setEmail("ay@19");
		c1.setMobileNumber(710227);
		c1.setName("ayush");
		
		c1.getAddresses().add(new Address("kolata","cw","710206","Home"));
		c1.getAddresses().add(new Address("kolata1","hcwh1","7102064","Office"));
		c1.getAddresses().add(new Address("kolata2","cwh2","7102063","Tution"));
		
      em.getTransaction().begin();
		
		em.persist(c);
		em.persist(c1);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		
		String jpql="from Customer where cid= :ano";
		
		javax.persistence.Query q=em.createQuery(jpql);
		
		q.setParameter("ano", 1);
		
	
		List<Customer> emps= q.getResultList();
		
		for(Customer emp:emps) {
			System.out.println(emp.getName());
			List<Address> addrs= emp.getAddresses();
			
			for(Address adr:addrs){
				
				System.out.println(adr);
			}
			
			
		}
        String jpql1="from Customer where cid= :ano1";
		
		javax.persistence.Query q1=em.createQuery(jpql1);
		
		q1.setParameter("ano1", 2);
		
	
		List<Customer> emps1= q1.getResultList();
		
		for(Customer emp:emps1) {
			System.out.println(emp.getName());
			List<Address> addrs= emp.getAddresses();
			
			for(Address adr:addrs){
				
				System.out.println(adr);
			}
			
			
		}
		
		em.close();


	}

}
