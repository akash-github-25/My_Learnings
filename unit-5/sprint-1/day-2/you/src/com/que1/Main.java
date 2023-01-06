package com.que1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static  List<? super Integer> fun1(List<? super Integer> list) {
		
		
		
//		for(Object obj:list) {
//			System.out.println(obj);
//		}
		
	return list;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Give 4 integer value ");
         Scanner sc=new Scanner(System.in);
         int one=sc.nextInt();
         int two=sc.nextInt();
         int three=sc.nextInt();
         int four=sc.nextInt();
		List<Integer> ilist= Arrays.asList(one,two,three,four);
		List<Number> slist= Arrays.asList(11,22,333,444);
		
		fun1(ilist);
		fun1(slist);
		System.out.println(fun1(ilist));
		
		

	}

}
