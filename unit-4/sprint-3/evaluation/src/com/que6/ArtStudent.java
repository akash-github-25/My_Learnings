package com.que6;

public class ArtStudent implements Student {
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}
 
	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArtStudent() {
		super();
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		Student s=new ArtStudent();
		
		ArtStudent a1=new ArtStudent();
//		System.out.println(a1.getEnglishMarks());
		double sum=this.getEnglishMarks()+this.getHindiMarks()+this.getHistoryMarks();
//		System.out.println(sum);
		double d=sum/3;
		return d;
		
	}

}
