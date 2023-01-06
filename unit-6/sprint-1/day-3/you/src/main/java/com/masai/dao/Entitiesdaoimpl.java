package com.masai.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class Entitiesdaoimpl implements Entitiesdao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
		Employee emp1= new Employee(emp.getEmpid(), emp.getName(),emp.getAddress(),emp.getSalary());
		
		
//		EntityTransaction et= em.getTransaction();
//		
//		et.begin();
//		
//		em.persist(student);
//		
//		et.commit();
		
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		
		em.getTransaction().commit();
		
		
		
		
		System.out.println("done...");
		
		
		
		
		em.close();
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub
EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
		
		Employee s= em.find(Employee.class, empId);
		
		if(s != null)
			return s.getAddress();
//		else
//			return "Student does not exist";
		
		em.close();
		return null;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em= emf.createEntityManager();
		
//	
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter roll to give grace marks ");
//		int roll=sc.nextInt();
		
		Employee s=em.find(Employee.class, empId); //if it returns the obj then the obj will be in p.state
		
		
		if(s == null){
			System.out.println("Employee does not exist..");
		}
		else
		{
			
//			System.out.println("Enter the grace marks");
//			int marks=sc.nextInt();
			
			em.getTransaction().begin();
//			Employee e1=new Employee();
			s.setSalary(bonus+s.getSalary());
			
			
			em.getTransaction().commit();
			
			return "salary is updated...";
			
		}
		em.close();
	
		System.out.println("done");
		return null;
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em= emf.createEntityManager();
		
	
		Scanner sc=new Scanner(System.in);
		
		
		
		Employee s= em.find(Employee.class, empId);
		
		if(s != null){
			
			em.getTransaction().begin();
			
			em.remove(s);
			
			em.getTransaction().commit();
			
			
			System.out.println("Employee removed....");
			return true;
			
		}
		
		em.close();
		System.out.println("done");
		return false;
		
	}

}
