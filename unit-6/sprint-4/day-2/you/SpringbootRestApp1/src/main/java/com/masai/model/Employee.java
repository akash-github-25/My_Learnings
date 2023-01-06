package com.masai.model;

public class Employee {
private String name;
private int id;

	@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

	public Employee() {
	super();
}

	public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
