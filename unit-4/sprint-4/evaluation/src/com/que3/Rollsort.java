package com.que3;

import java.util.Comparator;

public class Rollsort implements Comparator<Student>{

	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRollNo()>o2.getRollNo()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
