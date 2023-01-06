package com.que2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		students.add(new Student("ak1", 550));
		students.add(new Student("ak2", 750));
		students.add(new Student("ak3", 450));
		students.add(new Student("ak4", 820));
		students.add(new Student("ak5", 720));
		students.add(new Student("ak6", 620));
//		System.out.println(students);
		students.removeIf( student -> student.getMarks() < 700 );
		System.out.println(students.toString()); 

	}

}
