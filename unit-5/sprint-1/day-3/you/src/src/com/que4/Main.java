package com.que4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> m=new HashMap<>();
		m.put("WB",Arrays.asList("Asansol","Kolkata","Burdawan","santragchi") );
		m.put("Maharastra",Arrays.asList("Mumbai","Kolkapur","Burbone","Northzone"));
		m.put("Bihar", Arrays.asList("Patna","Sakri","Aara","Bhawanipur"));
		m.put("jammu", Arrays.asList("apple","orange","srinagar","leh"));
		Set<String> states= m.keySet();
		List<String> l=new ArrayList<>(states);
		Collections.sort(l);
		Collections.reverse(l);
		for(String s1:l) {
			 for(Map.Entry<String, List<String>> m1:m.entrySet() ) {
			 if(m1.getKey().equals(s1)) {
				 System.out.println("State- "+m1.getKey());
				 System.out.println("Cities of state");
				 List<String> list=new ArrayList<>(m1.getValue());
				 for(String c:list) {
					 System.out.println(c);
				 }
				 System.out.println("*****************");

			 }

	}
	}

	}

}
