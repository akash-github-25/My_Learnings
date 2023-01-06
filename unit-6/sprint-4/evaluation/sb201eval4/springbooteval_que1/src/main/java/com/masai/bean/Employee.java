package com.masai.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // to autogenerate ID.
	@Min(1)
	private Integer empId;
	@Size(min=2,max=20,message="name length b/w 2 to 20")
	private String empName;
	@Min(100)
	private Integer salary;
	@Size(min=2,max=40,message="address length b/w 2 to 40")
	private String address; 
	@Size(min=2,max=40,message="email length b/w 2 to 40")
	private String email;
	@Size(min=10,max=10,message="mobile length must be 10")
	private String mobile;
	@Size(min=2,max=10,message="password length b/w 2 to 20")
	private String password;
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, Integer salary, String address, String email, String mobile,
			String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
