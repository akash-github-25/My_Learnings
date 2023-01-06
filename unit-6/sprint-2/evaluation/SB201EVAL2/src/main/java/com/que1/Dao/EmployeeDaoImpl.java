package com.que1.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.que1.Entity.Department;
import com.que1.Entity.Employee;
import com.que1.Exception.DepartmentException;
import com.que1.Exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDepartment(Department dept) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		
		
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		

		
		
		
		Employee emp=  em.find(Employee.class, empId);
		Department dep=  em.find(Department.class, deptId);
	    dep.getEmp().add(emp);
		emp.setDept(dep);
		
		if(emp==null) {
			System.out.println("employee not present");
		}else {
			if(dep==null) {
				System.out.println("department not present");
			}else {
				
				em.getTransaction().begin();
				
				em.persist(dep);
				
				em.getTransaction().commit();
				em.close();
				System.out.println("done");
				
				
			}
		}
		
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
//EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "select emp from Department where deptName=:di";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter("di", deptName);
		
		List<Employee> e2 = q.getResultList();
		if(e2==null) {
			
		}else {
			return e2;
		}
		return null;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		//EntityManager em = EMUtil.provideEntityManager();
				
				String jpql = "select dept from Employee where empID=:di";
				
				Query q = em.createQuery(jpql);
				
				q.setParameter("di", empId);
				
				Object q2=q.getSingleResult();
				
				Department d2=(Department)q2;
				
				return d2;
				
				
				
	}

}
