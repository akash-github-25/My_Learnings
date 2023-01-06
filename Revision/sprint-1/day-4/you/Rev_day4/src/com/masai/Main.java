package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
//	public StudentService ss;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentService ss=new StudentServiceImpl();
//		System.out.println("Choose 1.addStudent 2.deleteStudent 3.findbyid 4.findbpincode 5.sort 6.marks 7.add_and_;getallStudents");
//		int choice =sc.nextInt();
		Integer x;
		List<Student> students=new ArrayList<Student>();
		int take=1;
	while(true) {
		System.out.println("Choose 1.addStudent 2.deleteStudent 3.findbyid 4.findbpincode 5.sort 6.marks 7.add_and_;getallStudents");
		int choice =sc.nextInt();
		switch (choice) {
		case 1:
			Student stud =new Student();
			stud.setName("akash");
			stud.setSection("A");
			stud.setAddress(new Address("kol","wb",711227));
			stud.setMarks(100);
			Student stud1=new Student();
			stud1.setName("bkash1");
			stud1.setSection("A1");
			stud1.setAddress(new Address("kol1","wb1",700227));
			stud1.setMarks(120);
			
			ss.addStudent(stud);
			ss.addStudent(stud1);
			students.add(stud);
			students.add(stud1);
			break;
		case 2:
			x=sc.nextInt();
		    ss.deleteStudent(x);
		    break;
		
		case 3:
			x=sc.nextInt();
			Student s=ss.findStudent(x);
			System.out.println(s);
			break;
			
		case 4:
			x=sc.nextInt();
			Student s1=ss.findStudentbyPincode(x);
			System.out.println(s1);
			break;
			
		case 5:
			List<Student> good=ss.sortStudent(students);
			for(Student n:good) {
				System.out.println(n);
			}
			break;
		case 6:
			List<Integer> marks=ss.Marks(students);
			System.out.println(marks);
			break;
		case 7:
			List<Student> f=new ArrayList<>();
			f.add(new Student(1,"krishna",80,"a",new Address("ranchi","bihar",40044)));
			List<Student> students2=ss.addAllStudent(f);
			for(Student z:students2) {
				System.out.println(z);
			}
			break;
		case 8:
			List<Student> p=ss.getAll();
			for(Student a:p) {
				System.out.println(a);
			}
			break;
		}
	}


}
}
