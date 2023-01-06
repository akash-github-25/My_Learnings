package com.que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {

System.out.println("Give product id");
int a=sc.nextInt();
System.out.println("Give product Name");
String s=sc.next();
System.out.println("Give Product price");
double d=sc.nextDouble();
Product p=new Product(a,s,d);
pr.add(p);
	}
		
		System.out.println("1 for sorting the product according to the productPrice\r\n"
				+ "○ 2 for sorting the product according to the productName\r\n"
				+ "○ 3 for sorting the product according to the productId\r\n"
				+ "○ If the user will supply any invalid number then sort the\r\n"
				+ "product with productId by default\r\n"
				+ "");
	int h=sc.nextInt();
	if(h==3) {
		Collections.sort(pr,new Productidsort());
		for(Product a:pr) {
			System.out.println("productid "+a.getProductId());
			System.out.println("productName "+a.getProductName());
			System.out.println("ProductPrice "+a.getProductPrice());
			System.out.println("...................................");
		}
	}else if(h==2) {
	   Collections.sort(pr,new Productnamesort());
	   for(Product a:pr) {
			System.out.println("productid "+a.getProductId());
			System.out.println("productName "+a.getProductName());
			System.out.println("ProductPrice "+a.getProductPrice());
			System.out.println("...................................");
		}
	}else if(h==1) {
		Collections.sort(pr,new Productpricesort());
		for(Product a:pr) {
			System.out.println("productid "+a.getProductId());
			System.out.println("productName "+a.getProductName());
			System.out.println("ProductPrice "+a.getProductPrice());
			System.out.println("...................................");
		}
	}else {
		Collections.sort(pr,new Productidsort());
		for(Product a:pr) {
			System.out.println("productid "+a.getProductId());
			System.out.println("productName "+a.getProductName());
			System.out.println("ProductPrice "+a.getProductPrice());
			System.out.println("...................................");
		}
	}
		

}
}
