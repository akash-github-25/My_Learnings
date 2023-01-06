package com.que1;

public class Emloyee {
	int Id;
	String Name;
	int Salary;
	
	public Emloyee(int id, String name, int salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}

	public Emloyee() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
