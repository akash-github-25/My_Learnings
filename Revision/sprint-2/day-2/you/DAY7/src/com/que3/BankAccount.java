package com.que3;

public class BankAccount {
	
	private String name;
	private String accno;
	private int amount;
	public BankAccount(String name, String accno, int amount) {
		super();
		this.name = name;
		this.accno = accno;
		this.amount = amount;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	

}
