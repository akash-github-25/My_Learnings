package com.que4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.que4.Student;

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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		Student s1=this;
		if(s.getName().equals(s.getName()) && s.getMarks()==s1.getMarks()) {
			return true;
		}else {
			return false;
		}
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Student> l=new HashSet<>();
    l.add(new Student("akash",770));
	l.add(new Student("akash",770));
	l.add(new Student("anku",900));
	l.add(new Student("babu",485));
	l.add(new Student("ladoo",499));
	Set<Student> l1=l.stream().filter((p)->p.getMarks()>500).collect(Collectors.toSet());
	System.out.println(l1);
	}

}
