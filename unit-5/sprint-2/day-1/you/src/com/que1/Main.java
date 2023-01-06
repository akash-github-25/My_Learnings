package com.que1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give one number");
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		try {
			int i=Integer.parseInt(s);
			int s1=i*i;
			System.out.println("The square value is "+s1);
			
		}catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		System.out.println("The work has been done successfully\r\n"
				+ "");
	}

}
