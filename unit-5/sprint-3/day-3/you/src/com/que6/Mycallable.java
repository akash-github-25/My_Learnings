package com.que6;

import java.util.concurrent.Callable;

public class Mycallable implements Callable {
	int num;
	

	public Mycallable(int num) {
		super();
		this.num = num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		if(num%2==0) {
			return "Even Number";
		}else {
			return "Odd Number";
		}
//		return null;
		
	}

}
