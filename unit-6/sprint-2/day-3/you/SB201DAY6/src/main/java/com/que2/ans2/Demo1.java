package com.que2.ans2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.mysql.cj.Query;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		String jpql="from Customer where cid=:cd";
javax.persistence.Query q= em.createQuery(jpql);
		
q.setParameter("cd",1);
		
		List<Customer> list= q.getResultList();
		em.close();
		System.out.println(list.get(0).getAddresses());
	}

}
