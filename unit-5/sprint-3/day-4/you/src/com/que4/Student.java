package com.que4;

import java.io.Serializable;

public class Student implements Serializable{
	int roll;
	String name;
	int marks;
	Address address;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}

	public Student() {
		super();
	}

	public Student(int roll, String name, int marks, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
