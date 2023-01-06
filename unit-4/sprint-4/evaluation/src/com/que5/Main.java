package com.que5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Everybody, welcome to collection in JAVA . Collection, is like a container and powerful concept in java!";
//		char[] c=s.toCharArray();
		String[] sq=s.trim().split(" ");
		System.out.println(sq.length);
		List<Main> l=new ArrayList<>();
		int count=0;
		for(int i=0;i<sq.length;i++) {
			
			for(int j=i+1;j<sq.length;j++) {
				if(sq[i].toLowerCase().replaceAll("[!;:?.,]","").equals(sq[j].toLowerCase().replaceAll("[!;:?.,]",""))) {
					count++;
				}
//				System.out.println(c[i]);
			}
		}
		System.out.println("Number of words "+ sq.length +"Number of unique words "+(sq.length-count));

//	}
		
//		int count=0;
//		for(String s1:s) {
//           for(String s2:s) {
//        	   
//           }
//		}
	}
}
