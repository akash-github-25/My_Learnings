package com.que2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
	private int roll;
	private String name;
	private int marks;
	

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


	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	public Student() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, String> t=new TreeMap<>(new Sort());
		t.put(new Student(1,"akash",95),"Kolkata");
		t.put(new Student(2,"ayush",100),"Tanmaypur");
		t.put(new Student(3,"ashu",97),"housingghat");
		
		Set<Map.Entry<Student,String>> sets= t.entrySet();
		for(Map.Entry<Student,String> x:sets) {
			System.out.println("State- "+x.getValue());
			System.out.println("Students detail");
			Student stud=x.getKey();
			System.out.println("Roll- "+stud.getRoll());
			System.out.println("Name- "+stud.getName());
			System.out.println("Marks- "+stud.getMarks());
			
			System.out.println("*********************************");
			
		}

	}

}
