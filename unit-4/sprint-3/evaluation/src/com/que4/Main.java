package com.que4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a String =>");
  String s=sc.next();
  System.out.println("Enter a position =>");
  int i=sc.nextInt();
  char[] chr=s.toCharArray();
  while(chr.length<i) {
	  System.out.println("Invalid position, Please enter a valid position =>");
	  int j=sc.nextInt();
	  i=j;
  }
  System.out.println("Character at the position 3 =>"+chr[i]);
	}

}
