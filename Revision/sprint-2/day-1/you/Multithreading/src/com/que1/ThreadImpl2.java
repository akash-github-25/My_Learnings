package com.que1;

public class ThreadImpl2 implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			int sum=0;
		for(int i=1;i<=10000;i++) {
			sum=sum+i;
//			System.out.println("IN ThreadImpl2--"+sum);
			System.out.println(i);
		}
		
		System.out.println("IN ThreadImpl2-"+sum);
		}
		
	}

}
