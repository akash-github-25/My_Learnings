package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;
import com.masai.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	public EmployeeRepo er;

	@Override
	public Employee getEmployee(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> op=er.findById(empId);
		Employee x=op.get();
		if(x!=null) {
		return x;
		}else {
			throw new EmployeeException("Employee is not present!");
		}
	}

	@Override
	public Employee getEmployeeManager(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> emp1=er.findById(empId);
		Employee x=emp1.get();
		if(x!=null) {
		Integer d=x.getReporting_manager_id();
		Optional<Employee> r=er.findById(d);
		Employee ans=r.get();
		return ans;
		}else {
			throw new EmployeeException("Employee is not present!");
		}
	}

	@Override
	public Employee[] getEmployeeReportee(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> x=er.viewEmployeeesByManagerId(empId);
		if(!x.isEmpty()) {
		Employee[] x1=new Employee[x.size()];
		for(int i=0;i<x1.length;i++) {
			x1[i]=x.get(i);
		}
		return x1;
		}else {
			throw new EmployeeException("Employee is not prsent!");
		}
	}

	@Override
	public Employee addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee c=er.save(emp);
		if(c!=null) {
		return c;
		}else {
			throw new EmployeeException("Employee is not prsent!");
		}
	}

}
