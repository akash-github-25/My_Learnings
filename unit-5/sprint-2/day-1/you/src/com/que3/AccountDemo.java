package com.que3;

public class AccountDemo {
//public AccountDemo() throws Exception {
//	super()
//	// TODO Auto-generated constructor stub
//}
	public static void main(String[] args){
		// TODO Auto-generated method stub

Account ac=new Account();

ac.accountNumber="12345";
ac.balance=500;
ac.deposit(100);
try {
	double c=ac.withdraw(700);
	System.out.println("Amount withdrawn is "+c);
} catch (InsufficientFundsException e) {
// TODO Auto-generated catch block
//	e.printStackTrace();
	System.out.println(e.getMessage());
}


}
}
