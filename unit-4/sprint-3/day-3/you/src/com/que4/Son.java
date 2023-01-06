package com.que4;

import java.util.Scanner;

import com.que3.Bank;

public final class Son extends Parent {
  void method4() {
	  System.out.println("method4..class Son");
  }
  


public Son(int number) {
//	Scanner sc=new Scanner();
	super(number);
	
}
  
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("take input");
  int n=sc.nextInt();
  if(n>=1 && n<=10) {
	Son s=new Son(n);
	Parent p=new Parent(n);
	p.method1();
//	p.method2();
	p.method3();
//	Son s=(Son)p;
//	s.method4();
	
  }else {
	  System.out.println("Invalid number");
  }

}

	

}
