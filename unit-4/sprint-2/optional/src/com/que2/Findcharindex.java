package com.que2;

import java.util.Scanner;

public class Findcharindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String x= sc.nextLine();
		
		System.out.println("Enter the character position you want to access:");
		int y=sc.nextInt();
		char[] chr=x.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(i==y) {
				System.out.println("Character at position "+ y +" is :"+"\n"+chr[i]);
				return;
			}
		}
		

	}

}
