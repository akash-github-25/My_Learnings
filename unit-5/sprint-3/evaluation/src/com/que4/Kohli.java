package com.que4;

public class Kohli implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}

}
