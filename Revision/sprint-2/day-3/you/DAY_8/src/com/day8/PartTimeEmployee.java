package com.day8;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PartTimeEmployee extends Student{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int salary;
private int consultant_code;


	public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getConsultant_code() {
	return consultant_code;
}

public void setConsultant_code(int consultant_code) {
	this.consultant_code = consultant_code;
}

	public PartTimeEmployee() {
	super();
	// TODO Auto-generated constructor stub
}



	public PartTimeEmployee(int id, String name, int age, int rollNo, int marks, int salary, int consultant_code) {
		super(id, name, age, rollNo, marks);
		this.salary = salary;
		this.consultant_code = consultant_code;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
