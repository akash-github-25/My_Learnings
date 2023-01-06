package com.que2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
	
		ArrayList<String> l1=new ArrayList<>();
		if(mobiles.containsKey(company)) {
			ArrayList<String> l2=mobiles.get(company);
			l2.add(model);
			return "Mobile added successfully";
		}else {
			l1.add(model);
			mobiles.put(company,l1);
		}
		return "Mobile added successfully";
	}
	public List<String> getModels(String company){
		List<String> l2=new ArrayList<>();
		if(mobiles.containsKey(company)) {
			List<String> l1=new ArrayList<>(mobiles.get(company));
			return l1;
		}else {
			return l2;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		String q1=m.addMobile("apple","2hx");
		String q2=m.addMobile("apple1","3hx");
		String q3=m.addMobile("apple","4hx");
		String q4=m.addMobile("apple2","5hx");
		String q5=m.addMobile("apple3","6hx");
		List<String> v=m.getModels("apple2");
		if(v.size()!=0) {
			System.out.println(v);
		}else {
			System.out.println("Invalid Company Supplied.");
		}
		

	}

}
