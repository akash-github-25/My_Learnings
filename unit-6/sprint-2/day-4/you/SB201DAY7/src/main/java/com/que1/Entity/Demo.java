package com.que1.Entity;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em=EMUtil.provideEntityManager();
		Employee e=new Employee();
		e.setName("akash");
		e.setHomeAddress(new Address("kol","hwh","72234"));
		e.setOfficeAddress(new Address("pune","bang","75234"));
		e.setSalary(10000);
		
		Employee e1=new Employee();
		e1.setName("ayush");
		e1.setHomeAddress(new Address("kolata","hwhrag","724234"));
		e1.setOfficeAddress(new Address("pune1","banglore","752534"));
		e1.setSalary(12000);
		
		Employee e2=new Employee();
		e2.setName("ramvir");
		e2.setHomeAddress(new Address("dhool","hwh23","72234"));
		e2.setOfficeAddress(new Address("pune","banglore","75234"));
		e2.setSalary(13000);
		
		Employee e3=new Employee();
		e3.setName("abhishek");
		e3.setHomeAddress(new Address("kolhas","hwh67","722394"));
		e3.setOfficeAddress(new Address("punebag","rampur","752344"));
		e3.setSalary(14000);
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.getTransaction().commit();
		
		em.close();

	}

}
