package com.que4.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.que4.Entity.ConractualEmployee;
import com.que4.Entity.SalariedEmployee;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from ConractualEmployee";
		Query w=em.createQuery(jpql);
		List<ConractualEmployee> c=w.getResultList();
		
		for(ConractualEmployee v:c) {
			System.out.println("Name "+v.getEmpName());
			System.out.println("Empid "+v.getEmpId());
			System.out.println("Mobileno. "+v.getMobileNumber());
			System.out.println("No. of working days "+v.getNoOfWorkingDays());
			System.out.println("Cost per day "+v.getCostofperday());
			
			System.out.println("*************************");
			
		}
	}

}
