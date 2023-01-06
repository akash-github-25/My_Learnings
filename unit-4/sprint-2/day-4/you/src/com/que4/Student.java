package com.que4;

public class Student {
     
	private int roll;
	private String name;
	private String address;
	private String collageName;
	 
	public void details() {
		System.out.println("roll :"+ roll);
		System.out.println("name :"+ name);
		System.out.println("roll :"+ address);
		System.out.println("roll :"+ collageName);
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	public static Student getStudent(boolean isFromNIT) {
//		isFromNIT=true;
		
		if(isFromNIT) {
			Student s1=new Student(22,"akash","tonmay apt","NIT");
			
			return s1;
		}else {
			Student s2=new Student(22,"ayush","tonmay apt","bhawanipur");
			return s2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
