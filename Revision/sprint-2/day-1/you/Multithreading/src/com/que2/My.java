package com.que2;

public class My extends Thread{
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			
			for(int i=0;i<=100;i++){
				System.out.println("child thread calculation");
			}
			
			System.out.println("child thread giving notification");
			this.notify();
			}
	}

}
