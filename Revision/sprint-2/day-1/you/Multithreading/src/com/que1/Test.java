package com.que1;

public class Test {

	public static void main(String[] args) {
		
		
		ThreadImpl2 t2=new ThreadImpl2();
		Thread t3=new Thread(t2);
		Thread t31=new Thread(t2);
		t31.start();

		
		ThreadImpl1 t1=new ThreadImpl1();
		t1.run();
		
		t3.start();

		
	}

}
