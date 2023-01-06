package com.que2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.que2")
@PropertySource("a1.properties")
public class AppConfig {
	@Bean
public List<Student> getList(){
	List<Student> theList=new ArrayList<Student>();
	theList.add(new Student(1,"akash","ak@47","kol",100));
	theList.add(new Student(2,"akash1","ak@471","kol1",1001));
	theList.add(new Student(3,"akash2","ak@472","kol2",1002));
	theList.add(new Student(4,"akash4","ak@474","kol4",1004));
	theList.add(new Student(5,"akash5","ak@475","kol5",1005));
	return theList;
}
	@Bean
	public Map<Student, Course> getMap(){
		Student s1=new Student(1,"akash","ak@47","kol",100);
		Student s2=new Student(2,"akash1","ak@471","kol1",1001);
		Student s3=new Student(2,"akash1","ak@471","kol1",1001);
		
		Map<Student, Course> theMap=new HashMap<>();
		theMap.put(s1, new Course(1,"dsa","1yr",100));
		theMap.put(s2, new Course(2,"coding","1yr",100));
		theMap.put(s3, new Course(3,"csbt","1yr",100));
		
		return theMap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
