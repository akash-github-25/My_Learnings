package com.que3;

public class Main {
	public int func1(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  X s=new Main()::func1;
	  System.out.println(s.convetStringToNumber("12"));
	}
	

}
