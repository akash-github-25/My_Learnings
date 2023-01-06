package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.Employee;
import com.masai.Exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub

		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
//		return employee;
		if(employee==null) {
			//throw IOException if not eligible to vote
			throw new EmployeeException("pASS values in correct manner");
			}
			else {
				System.out.println("Work done");
				return employee;
			
			}
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee h=EMUtil.provideEntityManager().find(Employee.class, empId);
		if(h!=null) {
		return h;
		}else {
			throw new EmployeeException("No employee data with empid -"+empId);
		}
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub

		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee acc=em.find(Employee.class, empId);
		
		if(acc != null){
			
			em.getTransaction().begin();
			
			em.remove(acc);
			
			
			em.getTransaction().commit();
		}else {
			throw new EmployeeException("No employee data with empid -"+empId);
		}
		
		em.close();
		
		
		
		return acc;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub

	
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(employee);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		if(employee==null) {
			//throw IOException if not eligible to vote
			throw new EmployeeException("pASS values in correct manner");
			}
			else {
				System.out.println("Updation done");
				return employee;
			
			}
		
		
	}

}
