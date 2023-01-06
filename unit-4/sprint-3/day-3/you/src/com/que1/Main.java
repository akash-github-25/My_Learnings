package com.que1;
   
public class Main {
	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
          Student s=new Student();
          
//          Student x=(Student)s;
          s.studentId=1;
          s.courseFee=100;
          s.courseEnrolled="JA111";
          s.city="kolkata";
          s.state="wb";
          s.pinCode="711227";
          
          return s;
		}else {
			 Instructor s=new Instructor();
	          
//	          Student x=(Student)s;
	          s.instructorId=2;
	          s.salary=200;
	          s.city="kolkata";
	          s.state="wb";
	          s.pinCode="711227";
	          
	          return s;
		}

		    
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());
		
		System.out.println(newStudent);
		System.out.println(newTeacher);

  
	}

}
