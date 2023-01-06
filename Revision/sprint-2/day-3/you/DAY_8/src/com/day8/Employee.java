package com.day8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Employee extends Person implements Externalizable{

private int salary;
private String department;
private transient String work_location;
public Employee(int id, String name, int age, int salary, String department, String work_location) {
	super(id, name, age);
	this.salary = salary;
	this.department = department;
	this.work_location = work_location;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, int age) {
	super(id, name, age);
	// TODO Auto-generated constructor stub
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getWork_location() {
	return work_location;
}
public void setWork_location(String work_location) {
	this.work_location = work_location;
}
@Override
public String toString() {
	return "Employee [salary=" + salary + ", department=" + department + "]";
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	  out.writeObject(department);
      out.writeInt(salary);
	
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	department = (String)in.readObject();
    salary = in.readInt();
	
}




}
