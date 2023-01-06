package com.que3;

public class Account {
	String accountNumber;
	double balance;
	
	public void deposit(int amount) {
		balance =balance+amount;
//	ac.balance=ac.balance+amount;
	}
	public double withdraw(int amount)throws InsufficientFundsException{
	
		if(amount<balance) {
			balance=balance-amount;
			return balance;
		}else {
			InsufficientFundsException i=new InsufficientFundsException("Paisa kaam hai");
			throw i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
//		Account ac=new Account();
//		ac.accountNumber="12345";
//		ac.balance=500;
//		ac.deposit(100);
//		try {
//			double c=ac.withdraw(700);
//		} catch (InsufficientFundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
