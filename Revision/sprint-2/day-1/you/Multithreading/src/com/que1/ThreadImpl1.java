package com.que1;

public class ThreadImpl1 extends Thread{
@Override
public void run() {
	synchronized (this){
		int sum=0;
		for(int i=1;i<=10000;i++) {
			sum=sum+i;
//			System.out.println("IN ThreadImpl1--"+sum);
			System.out.println("a");
			
		}
		System.out.println("IN ThreadImpl1--"+sum);
	}
	
}
}
