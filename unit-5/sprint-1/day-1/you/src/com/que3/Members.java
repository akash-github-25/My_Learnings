package com.que3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
//import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Members extends Library {
	int memberId;
	String memberName;
	int membershipNo;
	String membershipEnddate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet<Members> lt=new TreeSet<>(new Sort());
//		 List<Members> lt1=new LinkedList<>(lt);
		System.out.println("enter the number of Memebers");
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int x=0;x<tc;x++) {
		Members b=new Members();
		System.out.println("memberId");
		b.memberId=sc.nextInt();
		System.out.println("memeberName");
		b.memberName=sc.next();
		System.out.println("membershipNo");
		b.membershipNo=sc.nextInt();
		System.out.println("membershipEnddate in dd-mm-yyyy");
		
	   b.membershipEnddate=sc.next();
	  
//	   System.out.println(date);
		lt.add(b);
		}
		List<Members> lt1=new LinkedList<>(lt);
		
       
//       lt.add(b);
//		System.out.println(lt.toString());
//		int take=0;
        for(int i=0;i<lt1.size();i++) {
        	for(int j=i+1;j<lt1.size();j++) {
                
        		if((lt1.get(i).memberId==lt1.get(j).memberId)||(lt1.get(i).membershipNo==lt1.get(j).membershipNo)){
            		System.out.println("It is equal");
           		lt1.remove(j);
//            		take=1;
           		break;
          	}
       	}
       }
       
//        m.add(lt);
	
		
        
       
       
        	for(Members b2:lt1) {
        		
        		System.out.println(b2.memberId);
        		System.out.println(b2.memberName);
        		System.out.println(b2.membershipNo);
        		System.out.println(b2.membershipEnddate);
        	}
        	
	}

}
