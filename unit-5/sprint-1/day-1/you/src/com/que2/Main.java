package com.que2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Product> p=new PriorityQueue<>(new Sort());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of users");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("ProductId");
		int id=sc.nextInt();
		System.out.println("ProductName");
		String s=sc.next();
		System.out.println("ProductPrice");
		int pr=sc.nextInt();
		Product p1=new Product(id,s,pr);
		p.add(p1);
		}
		Product p2;
		while((p2=p.poll())!=null) {
			System.out.println(p2);
		}
		

	}

}
