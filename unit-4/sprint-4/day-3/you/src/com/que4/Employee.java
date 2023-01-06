package com.que4;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	@Override
	public String toString() {
//		Department d=new Department();
		
//		System.out.println(d.getDepartmentId());
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department id=" + department.getDepartmentId() + ",department name=" +department.getDepartmentName()+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
