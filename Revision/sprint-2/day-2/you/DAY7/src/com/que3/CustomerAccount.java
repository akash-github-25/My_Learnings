package com.que3;

public class CustomerAccount {
private String name;
private String accno;
private int amount;


	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAccno() {
	return accno;
}


public void setAccno(String accno) {
	this.accno = accno;
}


public int getAmount() {
	return amount;
}


public void setAmount(int amount) {
	this.amount = amount;
}


	public CustomerAccount() {
	super();
	// TODO Auto-generated constructor stub
}


	public CustomerAccount(String name, String accno, int amount) {
	super();
	this.name = name;
	this.accno = accno;
	this.amount = amount;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
