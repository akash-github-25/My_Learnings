package com.que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Loan object by name loan
		Lion l=Lion.getLionObj();
		double permanentEmployeeLoan=l.calculateLoanAmount(new
		PermanentEmployee(1,"Name1",1000));
		double temporaryEmployeeLoan=l.calculateLoanAmount(new
		TemporaryEmployee(2,"Name2",20,100));
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
	}

}
