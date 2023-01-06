package com.que4;

import java.util.Comparator;

public class Sort implements Comparator<Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		if(o1.getMarks()>=o2.getMarks()) {
			return -1;
		}else {
			return 1;
		}
	}

}
