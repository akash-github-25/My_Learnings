package com.que1;

public class Employee {
  private int empId;
  private String name;
 private int salary;
 

	public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


	public Employee(int empId, String name, int salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}


	public Employee() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
