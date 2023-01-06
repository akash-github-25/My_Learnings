package com.que2;

public class Main implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		Thread t=new Thread(m);
		t.start();
		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int mul=1;
			for(int i=1;i<=10;i++) {
				mul=mul*i;
			}
			this.notify();
			System.out.println(mul);
		}
		
	}

}
