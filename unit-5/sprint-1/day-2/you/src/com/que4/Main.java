package com.que4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void sortMap(Map<String,Student> s) {
		List<Student> list=new ArrayList<>(s.values());

		Collections.sort(list,new Sort());

		
		
			 for(Student s1:list) {
				 for(Map.Entry<String, Student> m:s.entrySet() ) {
				 if(m.getValue().equals(s1)) {
					 System.out.println("State- "+m.getKey());
					 System.out.println("roll- "+s1.getRoll());
					 System.out.println("Name- "+s1.getName());
					 System.out.println("Marks- "+s1.getMarks());
					 System.out.println("************************");

				 }
	  
		}
		}

	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> s=new HashMap<>();
		s.put("WB",new Student(1,"akash",98));
		s.put("Delhi",new Student(2,"abhi",88));
		s.put("jharkhand",new Student(3,"kesav",97));
		s.put("patna", new Student(4,"ayush",100));
		sortMap(s);
	}

}
