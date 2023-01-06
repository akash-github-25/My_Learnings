package com.que3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> x=new HashMap<>();
		x.put("india1", new Student(1,"Akash","ak@25",100));
		x.put("india2", new Student(1,"Abask","ak@25",90));
		x.put("india3", new Student(1,"Zebra","ak@25",80));
		x.put("india4", new Student(1,"Tea","ak@25",99));
		x.put("india5", new Student(1,"Lotte","ak@25",95));
		
		Sort s=(Map<String, Student> x1)->{
			List<Student> list=new ArrayList<>(x1.values());

			Collections.sort(list,new Sorting());
LinkedHashMap<String, Student> t=new LinkedHashMap<>();

				 for(Student s1:list) {
					 for(Map.Entry<String, Student> m:x1.entrySet() ) {
					 if(m.getValue().equals(s1)) {
						 t.put(m.getKey(), m.getValue());

					 }

			}
			}
				 return t;

		};
		
		Map<String, Student> t1=s.sortMapUsingStudentName(x);
		for(Map.Entry<String, Student> s1:t1.entrySet()) {
			 System.out.println(s1.getKey()+"....."+s1.getValue());
		}
		
//
	}

}
	
