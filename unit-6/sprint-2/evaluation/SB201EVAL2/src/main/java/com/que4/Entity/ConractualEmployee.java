package com.que4.Entity;

import javax.persistence.Entity;

@Entity
public class ConractualEmployee extends Employee {
	private int noOfWorkingDays;
	private int costofperday;
	private int mobileNumber;

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostofperday() {
		return costofperday;
	}

	public void setCostofperday(int costofperday) {
		this.costofperday = costofperday;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public ConractualEmployee() {
		super();
	}

	public ConractualEmployee(int noOfWorkingDays, int costofperday, int mobileNumber) {
		super();
		this.noOfWorkingDays = noOfWorkingDays;
		this.costofperday = costofperday;
		this.mobileNumber = mobileNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
