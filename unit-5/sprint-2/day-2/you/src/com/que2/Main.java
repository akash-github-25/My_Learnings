package com.que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("Kolkata");
		l.add("Mumbai");
		l.add("Banglore");
		Sorting s=(List<String> l1)->{
		  Collections.sort(l1);
		  Collections.reverse(l1);
		  for(String s1:l1) {
			  System.out.println(s1);
		  }
		};
		s.sorted(l);
	    
		

	}

}
