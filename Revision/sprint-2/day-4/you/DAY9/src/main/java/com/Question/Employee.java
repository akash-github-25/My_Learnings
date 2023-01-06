package com.Question;

public class Employee {
	
private int EmployeeId;
private String name;
private String address;
public Employee(int employeeId, String name, String address) {
	super();
	EmployeeId = employeeId;
	this.name = name;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + ", address=" + address + "]";
}

}
