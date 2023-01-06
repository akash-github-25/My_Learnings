package com.que1;

public class Child1 implements Runnable{
	Akash a1;
	Ayush a2;
	

	public Child1(Akash a1, Ayush a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		a1.fun2(a2);
		
	}

}
