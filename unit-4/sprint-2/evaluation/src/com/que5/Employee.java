package com.que5;

public class Employee {
    
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public int calculateNetSalary(int pfPercentage) {
		double x=salary*pfPercentage/100;
		netSalary=salary-x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
