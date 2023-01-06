package com.que4.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.que4.Entity.SalariedEmployee;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from SalariedEmployee";
		Query w=em.createQuery(jpql);
		List<SalariedEmployee> c=w.getResultList();
		
		for(SalariedEmployee v:c) {
			System.out.println("Name "+v.getEmpName());
			System.out.println("Empid "+v.getEmpId());
			System.out.println("Email "+v.getEmail());
			System.out.println("Slary "+v.getSalary());
			System.out.println("*************************");
			
		}

	}

}
