package com.masai.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer employee_id;
	@NotNull
	 private String first_name;
	@NotNull
	 private String last_name;
	 private String email;
	 private Long phone_number;
	 private Integer salary;
	 private Integer reporting_manager_id;
	public Employee(Integer employee_id, String first_name, String last_name, String email, Long phone_number,
			Integer salary, Integer reporting_manager_id) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.salary = salary;
		this.reporting_manager_id = reporting_manager_id;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getReporting_manager_id() {
		return reporting_manager_id;
	}
	public void setReporting_manager_id(Integer reporting_manager_id) {
		this.reporting_manager_id = reporting_manager_id;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", salary=" + salary
				+ ", reporting_manager_id=" + reporting_manager_id + "]";
	}
	 
}
