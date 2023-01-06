package com.que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("give cid");
		int r=sc.nextInt();
		sc.nextLine();
		System.out.println("give cname");
		String n=sc.next();
		System.out.println("give fees");
		int ad=sc.nextInt();
		System.out.println("give duration");
		String mob=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sqleval4";
		
		try(Connection c=DriverManager.getConnection(url,"root","ak@25");) {
			
		PreparedStatement p=c.prepareStatement("insert into course values(?,?,?,?)");
	   
	    p.setInt(1,r);
	    p.setString(2,n);
	    p.setInt(3,ad);
	    p.setString(4,mob);
	    int z=p.executeUpdate(); 
	    if(z>0) {
	    	System.out.println("insertion done");
	    }else {
	    	System.out.println("not done!");
	    }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
