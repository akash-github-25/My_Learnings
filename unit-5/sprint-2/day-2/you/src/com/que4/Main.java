package com.que4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> x=new ArrayList<>();
		
		PrintList i1 = (x1) -> {
			for(String s:x1) {
				System.out.println(s);
			}
			};
			
			x.add("Mumbai");
			x.add("Chennai");
			x.add("Kolkata");
			i1.display(x);
			

	}
}
