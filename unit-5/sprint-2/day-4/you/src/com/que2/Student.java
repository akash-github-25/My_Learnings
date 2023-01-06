package com.que2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
 private String name;
 private int marks;
 
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

	public Student(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student("akash",70));
		l.add(new Student("ayush",100));
		l.add(new Student("anku",90));
		l.add(new Student("babu",85));
		l.add(new Student("ladoo",99));
		
		Student maxl= l
				.stream()
				.max((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1: -1)
				.get();
		System.out.println(maxl);

	}

}
