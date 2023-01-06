package com.que4;

public class Rohit implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int mul=1;
			for(int i=1;i<=10;i++) {
				mul=mul*i;
			}
			System.out.println(mul+" "+Thread.currentThread().getName());
			this.notify();
		}
		
		
	}

}
