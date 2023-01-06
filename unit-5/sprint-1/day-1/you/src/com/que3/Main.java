package com.que3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Books> lt=new LinkedList<>();
		System.out.println("enter the number of book");
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int x=0;x<tc;x++) {
		Books b=new Books();
		System.out.println("Bookid");
		b.bookId=sc.nextInt();
		System.out.println("BookName");
		b.bookName=sc.next();
		System.out.println("BookAuthor");
		b.BookAuthor=sc.next();
		lt.add(b);
		}
		
       
//       lt.add(b);
//		System.out.println(lt.toString());
		int take=0;
        for(int i=0;i<lt.size();i++) {
        	for(int j=i+1;j<lt.size();j++) {
        		if(lt.get(i).bookId==lt.get(j).bookId) {
//            		System.out.println("It is equal");
            		lt.remove(i);
//            		take=1;
            		break;
            	}
        	}
        }
        	for(Books b2:lt) {
        		System.out.println(b2.bookId);
        		System.out.println(b2.bookName);
        		System.out.println(b2.BookAuthor);
        	}
        	
        	 
        }

	}


