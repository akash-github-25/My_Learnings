package com.que3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		ThreadA a=new ThreadA("akash",s);
		ThreadB a1=new ThreadB("ayush",s);
		Thread t1=new Thread(a);
		Thread t2=new Thread(a1);

		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();


	}

}
