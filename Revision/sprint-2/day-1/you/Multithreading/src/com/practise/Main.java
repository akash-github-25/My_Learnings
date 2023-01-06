package com.practise;

public class Main extends Thread{
	int num;
	public Main(int num) {
		this.num=num;
		
	}
@Override
public void run() {
	for(int i=0;i<5;i++) {
	System.out.println(i+" "+num);
	}
}
}
