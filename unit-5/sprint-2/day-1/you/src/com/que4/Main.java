package com.que4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give value of a");
		int a=sc.nextInt();
		System.out.println("Give value of b");
		int b=sc.nextInt();
		try{
			int d=a/b;
			System.out.println("The quotient of "+a+"/"+b+" is "+ d);
		}catch(ArithmeticException a1) {
			System.out.println("DivideByZeroException caught");
		}	
		finally {
      System.out.println("Inside finally block\r\n"
      		+ "");
		}
	}

}
