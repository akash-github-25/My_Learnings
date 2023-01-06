package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query("select E from Employee E where E.reporting_manager_id=?1")
	public List<Employee> viewEmployeeesByManagerId(Integer manager_id);
}
