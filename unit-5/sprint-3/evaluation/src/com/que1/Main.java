package com.que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Akash a1=new Akash();
		Ayush a2=new Ayush();
		Child1 a=new Child1(a1,a2);
		Child2 b=new Child2(a1,a2);
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
//		try {
//			t1.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();

	}

}
