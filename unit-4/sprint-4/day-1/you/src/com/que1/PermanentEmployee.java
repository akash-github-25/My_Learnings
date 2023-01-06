package com.que1;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
//		PermanentEmployee p=new PermanentEmployee(employeeId, employeeName, basicPay);
		
		double PFamount= basicPay * 0.12;
		salary = basicPay-PFamount;
//		p.setSalary(basicPay-PFamount);
//		System.out.println(p.salary);
//		System.out.println(p.getSalary());
		

	}
	

}
