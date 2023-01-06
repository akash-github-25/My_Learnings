package com.que5;

public class Collage {
	Work w;
	
	public Collage(Work w) {
		super();
		this.w = w;
	}
	public void doJob(){
		
		System.out.println("Job is started");
		w.Do();
		//here it needs the service of its Dependencies
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
