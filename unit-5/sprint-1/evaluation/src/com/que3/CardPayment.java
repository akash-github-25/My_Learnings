package com.que3;

public class CardPayment implements Payment {
private int amount;

	public CardPayment() {
	super();
}

	public CardPayment(int amount) {
	super();
	this.amount = amount;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Card "+amount);
	}

}
