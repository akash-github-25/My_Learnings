package com.que3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> l=Arrays.asList(1,3,5,6,9);
  List<Integer> l1=l.stream().map((n)->n*n).collect(Collectors.toList());
  
  Intr i=(x)->{
	  System.out.println(x);
  };
  
  i.printl(l1);
  
	}

}
