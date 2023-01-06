package com.que3;

import java.util.Comparator;
import java.util.List;

public class Sorting implements Comparator<	Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
		
	}

}
