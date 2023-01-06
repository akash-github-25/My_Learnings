package com.que1;

public class Student extends Person {
	int studentId;
	String courseEnrolled;
	int courseFee;
//    @Override
//    public String toString() {
//    	Student s=new Student();
//    	return "Student [studentId="+s.studentId+", courseFee="+s.courseFee+", courseEnrolled="+s.courseEnrolled+",address=Address [city="+s.city+", state="+s.state+",+ pincode="+s.pinCode+]]"
//    			
////    	return "welcome";
//    	
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				 + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}
	
}

	
