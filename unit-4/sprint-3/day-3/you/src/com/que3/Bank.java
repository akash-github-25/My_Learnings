package com.que3;

public class Bank {
	public static Bank getObj() {
		Bank b=new Bank();
		return b;
	}
	private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
