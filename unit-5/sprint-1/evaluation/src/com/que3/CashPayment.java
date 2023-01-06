package com.que3;

public class CashPayment implements Payment {
	 private int amount;
	 
	public CashPayment() {
		super();
	}

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		//initialize amount using parameterized constructor
		//override doPayment() method and inside this print "Payment done using Cash "+amount;
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payement done using Cash"+amount);
		
	}

}
