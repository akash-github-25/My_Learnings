package com.que4.Entity;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{
	
	private int salary;
	private String email;
	
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(int salary, String email) {
		super();
		this.salary = salary;
		this.email = email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
