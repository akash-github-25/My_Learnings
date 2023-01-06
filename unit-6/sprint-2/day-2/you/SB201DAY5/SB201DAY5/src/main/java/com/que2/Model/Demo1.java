package com.que2.Model;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.mysql.cj.Query;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("pick ur no b/w 1 to 5");
		int x=sc.nextInt();
		if(x==1) {
		Product p1=new Product();
		p1.setPrice(100);
		p1.setProductName("Shoes");
		p1.setQuantity(1);
		
		Product p2=new Product();
		p2.setPrice(110);
		p2.setProductName("clothes");
		p2.setQuantity(1);
		
		Product p3=new Product();
		p3.setPrice(120);
		p3.setProductName("Shirts");
		p3.setQuantity(1);
		
		Product p4=new Product();
		p4.setPrice(130);
		p4.setProductName("Jeans");
		p4.setQuantity(1);
		
		Product p5=new Product();
		p5.setPrice(140);
		p5.setProductName("Belt");
		p5.setQuantity(1);
		

		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		
		
		
		em.getTransaction().commit();
		
		
		em.close();
		System.out.println("done");
		}else if(x==2) {
			javax.persistence.Query q= em.createNamedQuery("Product.getName");
			

			
			List<Object[]> list= q.getResultList();
			
			for(Object[] k:list) {
				String s=(String)k[0];
				int s1=(int)k[1];
				System.out.println("Name-"+s+"  "+"Price-"+s1);
			}

		}else if(x==3) {
javax.persistence.Query q= em.createNamedQuery("Product.getprice");
			
            q.setParameter("pid", 5);
			
			List<Integer> list= q.getResultList();
			
			for(Integer k:list) {
				System.out.println("Price is "+k);
			}
		}else if(x==4) {
//			
      String jpql="from Product where productId=:pid";
		 	TypedQuery<Product> tq= em.createQuery(jpql, Product.class);
			
		 	tq.setParameter("pid",5);
		 	List<Product> v=tq.getResultList();
		 	for(Product x4:v) {
		 		System.out.println(x4);
		 	}
		 	
       em.close();
		}else if(x==5) {
			 String jpql="from Product where quantity<:pid";
			 	TypedQuery<Product> tq= em.createQuery(jpql, Product.class);
				
			 	tq.setParameter("pid",5);
			 	List<Product> v=tq.getResultList();
//			 	System.out.println(v);
			 	for(Product x4:v) {
			 		System.out.println(x4);
			 	}
			 	

	       em.close();
		}else if(x==6) {
			
			
			
			String jpql= "select sum(price) from Product";
			
			TypedQuery<Long> q=em.createQuery(jpql,Long.class);
			
			long result= q.getSingleResult();
			
			System.out.println(result);
		}

	}

}
