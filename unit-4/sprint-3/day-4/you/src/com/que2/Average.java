package com.que2;

import java.util.Scanner;

public class Average {
	void calculateAverage(int[] age){
		float sum=0;
		for(int i=0;i<age.length;i++) {
			sum=sum+age[i];
		}
		float avg=sum/age.length;
		System.out.printf("Average is %.2f",avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("Please enter a valid employee count");
		}else {
		int[] age=new int[n];
		System.out.println("Enter the age for"+n+"Employee");
		for(int i=0;i<n;i++) {
			int age1=sc.nextInt();
			age[i]=age1;
			
		}
		Average a=new Average();
		a.calculateAverage(age);
		}
		

	}

}
