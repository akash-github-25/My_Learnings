package com.que3;

public class Student{
	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}

	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}
	

	public Student() {
		super();
	}

//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Student s1=this;
//		Student s2=(Student)obj;
//		int total=s1.engMarks +s1.mathsMarks+s1.scienceMarks;
//		int total1=s2.engMarks+s2.mathsMarks+s2.scienceMarks;
//		if(total>total1) {
//			return true;
//		}else if(total<total1) {
//			return false;
//		}else if(total==total1) {
//			if(s2.name.compareTo(s1.name)==1) {
//				return true;
//			}else if(s1.name.compareTo(s2.name)==-1) {
//				return false;
//			}else if(s1.name.equals(s2.name)){
//				if(s1.rollNo>s2.rollNo) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		}
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//	    return 1;
//	}
	@Override
	public String toString() {
		return "Student [rollNo= " + rollNo + ", name= " + name + ", mathsMarks= " + mathsMarks + ", scienceMarks= "
				+ scienceMarks + ", engMarks= " + engMarks + "]";
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}
	

	
}
