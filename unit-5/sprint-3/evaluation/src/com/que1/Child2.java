package com.que1;

public class Child2 implements Runnable {
Akash a1;
Ayush b1;

	public Child2(Akash a1, Ayush b1) {
	super();
	this.a1 = a1;
	this.b1 = b1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b1.fun1(a1);
		
	}

}
