package com.que3;

public class Student1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd"+i);
			}
		}
		
	}

}
