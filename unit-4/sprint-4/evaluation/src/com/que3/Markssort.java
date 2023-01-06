package com.que3;

import java.util.Comparator;

public class Markssort implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int total=s1.getEngMarks()+s1.getMathsMarks()+s1.getScienceMarks();
		int total1=s2.getEngMarks()+s2.getMathsMarks()+s2.getScienceMarks();
		if(total>total1) {
			return -1;
		}else if(total<total1) {
			return 1;
		}else if(total==total1) {
			if(s1.getName().equals(s2.getName())) {
				if(s1.getRollNo()>s2.getRollNo()) {
					return 1;
				}else {
					return -1;
				}
			}
			return s2.getName().compareTo(s1.getName());
			}
		
//		return false;
		return 0;
	}

}
