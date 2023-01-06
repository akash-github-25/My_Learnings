package com.que3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lm=new LinkedHashMap<>();
		lm.put("WestBengal", "Kolkata");
		lm.put("Maharastra", "Mumbai");
		lm.put("Bihar", "patna");
		lm.put("up", "lucknow");
		lm.put("Karnatka", "Bengaluru");
		 for(Map.Entry<String, String> m:lm.entrySet() ) {
			 System.out.println("State- "+m.getKey());
			 System.out.println("Capital- "+m.getValue());
			 System.out.println("************************");
		 }

	}

}
