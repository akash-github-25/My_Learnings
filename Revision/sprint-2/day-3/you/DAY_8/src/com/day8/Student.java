package com.day8;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Person implements Serializable{
 private int rollNo;
 private int marks;
 
	public Student(int id, String name, int age, int rollNo, int marks) {
	super(id, name, age);
	this.rollNo = rollNo;
	this.marks = marks;
}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
	    throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream in) throws IOException{
		throw new NotSerializableException();
	}



	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
