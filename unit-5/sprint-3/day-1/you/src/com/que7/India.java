package com.que7;

public class India implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India a=new India();
		Thread thread1=new Thread(a);
		Thread thread2=new Thread(a);
		thread1.setName("Dhoni thread");
		thread2.setName("Kohli thread");
		thread1.setPriority(8);
		thread2.setPriority(10);
		
		thread1.start();
		thread2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
				String name=Thread.currentThread().getName();
				int priority=Thread.currentThread().getPriority();
			System.out.println(name+"****"+priority);
		}
	}

}
