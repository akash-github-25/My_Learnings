package com.que1;

import java.util.Comparator;

public class Sort implements Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary()) {
			return -1;
		}else {
			return 1;
		}
	}

}
