package com.masai;

import java.util.Comparator;

public class sortStudents implements Comparator<Student>{

	public sortStudents() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
