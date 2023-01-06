package com.masai.work;

import java.util.Scanner;

import com.masai.dao.Entitiesdao;
import com.masai.dao.Entitiesdaoimpl;
import com.masai.entities.Employee;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Boolean x=true;
		while(x!=false) {
		System.out.println("Choose your option");
		System.out.println("1.add 2.get address 3.give bonus 4.delete 5.stop");
		Entitiesdao c=new Entitiesdaoimpl();
		int i=sc.nextInt();
		if(i==1) {
		System.out.println("give empid");
		int em=sc.nextInt();
		System.out.println("give ename");
		String en=sc.next();
		System.out.println("give address");
		String add=sc.next();
		System.out.println("give salary");
		int sal=sc.nextInt();
		c.save(new Employee(em,en,add,sal));
		}else if(i==2){
		System.out.println("Enter empid");
		int s=sc.nextInt();
		String v=c.getAddressOfEmployee(s);
		if(v!=null) {
			System.out.println(v);
		}else {
			System.out.println("Not present");
		}
	     
		}else if(i==3) {
			System.out.println("give empid");
			int t=sc.nextInt();
			System.out.println("give bonus amount");
			int bonus=sc.nextInt();
			String v1=c.giveBonusToEmployee(t, bonus);
			if(v1!=null) {
				System.out.println(v1);
			}else {
				System.out.println("bonus not updated");
			}
		}else if(i==4) {
			System.out.println("give empid to delete");
			int g=sc.nextInt();
			c.deleteEmployee(g);
		}else if(i==5) {
			System.out.println("Thank you for visiting");
			x=false;
		}

	}

}
}
