package com.masai.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeDTO;
import com.masai.exception.EmployeeException;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    public EmployeeRepo er;
	
	
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee d=er.save(emp);
		if(d!=null) {
			return d;
		}else {
			throw new EmployeeException("Employee cannot be added");
		}
		
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> r=er.findById(empId);
		if(r.isPresent()) {
			Employee f=r.get();
			return f;
		}else {
			throw new EmployeeException("Employee is not there with that id");
		}
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		
		List<Employee> v=er.findAll();
		if(v!=null) {
			return v;
		}else {
			throw new EmployeeException("Employee not present with that address");
		}
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> d=er.findById(empId);
		if(d.isPresent()) {
		er.deleteById(empId);
		return d.get();
		}else {
			throw new EmployeeException("Employee not present with that empid");
		}
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee s=er.loginEmployee(email,password);
		if(s!=null) {
		return s;
		}else {
			throw new EmployeeException("Employee is not authorised");
		}
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
	List<Employee> v=er.findByAddress(address);
	if(v!=null) {
		return v;
	}else {
		throw new EmployeeException("Employee not present with that address");
	}
		
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> d=er.findById(emp.getEmpId());
		if(d.isPresent()) {
		Employee f=	er.save(emp);
		return er.save(f);
		}else {
			throw new EmployeeException("Employee not present with that empid");
		}
		
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String h=er.getNameAndAddressByEmpId(empId);
		if(h.length()!=0) {
			return h;
		}else {
			throw new EmployeeException("Employee not present with that empid");
		}
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
//		return er.getNameAddressSalary();
		return null;
	}
	
}
