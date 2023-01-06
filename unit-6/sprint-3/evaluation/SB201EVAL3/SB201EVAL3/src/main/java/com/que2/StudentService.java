package com.que2;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	@Autowired
	private Map<Student, Course> theMap; // inject 3 entries with valid details
	@Autowired
	private List<Student> theList; //inject List of 5 Student object
	@Autowired
	@Value("${appName}")
	private String appName; //inject the AppName from the properties file
	
	public Map<Student, Course> getTheMap() {
		return theMap;
	}
	public void setTheMap(Map<Student, Course> theMap) {
		this.theMap = theMap;
	}
	public List<Student> getTheList() {
		return theList;
	}
	public void setTheList(List<Student> theList) {
		this.theList = theList;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public void printMap(){
		//print all the student's and their course details from theMap
		for(Map.Entry<Student, Course> b:theMap.entrySet()) {
			System.out.println("**************************");
			System.out.println("Student--"+b.getKey());
			System.out.println("Course--"+b.getValue());
			System.out.println("******************************");
		}
		}
		public void printList(){
		//sort the List of Student according to the marks (make use of Lamda
		//expression).
		//print all the sorted Student Details
			theList.sort((a,b)->a.getMarks()>b.getMarks()?1:-1);
			System.out.println("________________________________________________");
			theList.forEach(s->{
				System.out.println(s);
			});
			System.out.println("__________________________________________________");
		}
		public void printAppName(){
		//print the injected appName
			System.out.println("AppName-- "+appName);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
