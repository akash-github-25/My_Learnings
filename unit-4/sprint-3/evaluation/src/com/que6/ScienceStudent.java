package com.que6;

public class ScienceStudent implements Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks, int biologyMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.biologyMarks = biologyMarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ScienceStudent() {
		super();
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
	  int sum=this.biologyMarks+this.chemistryMarks+this.mathsMarks+this.physicsMarks;
	  double d=sum/4;
	  return d;
	}

}
