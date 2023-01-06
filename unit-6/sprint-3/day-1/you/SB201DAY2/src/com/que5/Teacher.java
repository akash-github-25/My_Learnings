package com.que5;

public class Teacher implements Work {
	public void teaches(){
		 System.out.println("Teacher teaches");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void Do() {
		// TODO Auto-generated method stub
		teaches();
	}

}
