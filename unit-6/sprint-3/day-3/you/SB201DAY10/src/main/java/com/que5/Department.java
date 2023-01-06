package com.que5;

public class Department {
	private int deptId;
	private String deptName;
	private String location;
	
	public Department(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
