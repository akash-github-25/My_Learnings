package com.que1;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
//	public TemporaryEmployee(int employeeId, String employeeName) {
//		super(employeeId, employeeName);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		 salary = hoursWorked*hourlyWages;
	}

}
