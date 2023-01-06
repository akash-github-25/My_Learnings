package com.que3;

public class Student {
	public  void fun1(String team) {
		synchronized(this) {
		for(int i=0;i<5;i++) {

		System.out.println("My team is "+team+" "+i);
		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Sabkuch thik hai");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
