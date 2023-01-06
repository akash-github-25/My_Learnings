package com.que4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhoni d=new Dhoni();
		Kohli k=new Kohli();
		Rohit r=new Rohit();
		
		Thread t1=new Thread(d);
		t1.setName("Dhoni");
		Thread t2=new Thread(k);
		t2.setName("Kohli");
		Thread t3=new Thread(r);
		t3.setName("Rohit");
		
		t1.setPriority(9);
		t3.setPriority(7);
		t2.setPriority(4);
		
		t1.start();
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t3.start();
		synchronized (t3) {
			try {
				t3.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		t2.start();
		
		
		
		
		

	}

}
