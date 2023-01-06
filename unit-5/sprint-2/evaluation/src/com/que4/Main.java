package com.que4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("akash");
		l.add("dkashe");
		l.add("akash");
		l.add("akashr");
		l.add("akash");
		l.add("bkashy");
		l.add("akash");
		l.add("akash");
		l.add("ckashu");
		l.add("akash");
//		System.out.println();
		System.out.println("Original list");
		l.forEach((e)->System.out.println(e));
		List<String> v=
		l.stream().filter((s)->s.length()%2==0).map((s)->s.toUpperCase()).collect(Collectors.toList());
		v.sort((s1,s2)->s1.compareTo(s2));
		System.out.println("Tansformed list");
		v.forEach((r)->System.out.println(r));
		
		

		
		
		
		
		

	}

}
