package com.que2;

public class Student {
private int roll;
private String name;
private int marks;

	@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}

	public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

	public Student() {
	super();
}

	public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
