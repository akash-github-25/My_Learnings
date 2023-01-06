package com.que4;

public class Dhoni implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int sum=0;
			for(int i=1;i<=20;i++) {
				sum=sum+i;
			}
			System.out.println(sum+" "+Thread.currentThread().getName());
			this.notify();
		}
		
	}

}
