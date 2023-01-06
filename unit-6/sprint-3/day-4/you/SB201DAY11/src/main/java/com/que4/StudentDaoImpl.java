package com.que4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.masai.utility.EMUtil;

@Repository
public class StudentDaoImpl implements StudentDao{
//    @Value("${name}")
//	String con;
	@Override
	public String insertStudentDetails(Student student) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(student);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return "Student registed Sucessfully";
		
		
	}

	@Override
	public List<Student> getAllStudentDetails() {
	
		EntityManager em= EMUtil.provideEntityManager();
		
		Query q= em.createQuery("from Student");
		
		List<Student> students= q.getResultList();
		
		em.close();
		
		return students;
		
	}
	
	

}
