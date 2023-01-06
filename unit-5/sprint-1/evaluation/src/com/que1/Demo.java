package com.que1;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		TreeMap<Employee, String> t=new TreeMap<>(new Sort());
		for(Map.Entry<Employee,String> x:originalMap.entrySet()) {
			t.put(x.getKey(), x.getValue());
		}
		Map<Employee, String> hm3=new HashMap<>(t);
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hm=new HashMap<>();
		hm.put(new Employee(1,"akash",100), "tata1");
		hm.put(new Employee(2,"ayush",400), "tata2");
		hm.put(new Employee(3,"abhi",200), "tata3");
		hm.put(new Employee(4,"anu",300), "tata4");
		hm.put(new Employee(5,"jam",100), "tata5");
		Demo d1=new Demo();
		Map<Employee, String> hm1=d1.sortMapUsingEmployeeSalary(hm);
		for(Map.Entry<Employee,String> x:hm1.entrySet()) {
//			List<Employee> l=new ArrayList<>(hm1.keySet());
			Employee s=x.getKey();
//			System.out.println(x.getKey());
//			for(Employee e:s) {
				System.out.println("****************");
				System.out.println(x.getValue());
				System.out.println(s.getEmpId());
				System.out.println(s.getName());
				System.out.println(s.getSalary());
				System.out.println("__________________");
//			}
		}

	}

}
