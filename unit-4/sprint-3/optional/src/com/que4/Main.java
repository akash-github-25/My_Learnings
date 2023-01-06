package com.que4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Take input : ");
		int n=sc.nextInt();
		Test t=new Test();
		int[] arr= t.display(n);//Take this argument from user using the Scanner class
		//Write the logic to print the elements
		String bag="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				bag=bag+arr[i]+" ";
			}
		}
		System.out.println(bag);

	}

}
