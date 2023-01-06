package com.que3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ticket f=new Ticket();
			int t;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter no of bookings");
		      t=sc.nextInt();
		      System.out.println("Enter the avilable tickets");
		      f.availableTickets=sc.nextInt();
		      for(int i=0;i<t;i++) {
		    	 
		    	  System.out.println("Enter the ticketid:");
		    	  f.ticketid=sc.nextInt();
		    	  System.out.println("Enter the price:");
		    	  f.price=sc.nextInt();
		    	  System.out.println("Enter the no of tickets:");
		    	  int noOfTickets=sc.nextInt();
		    	  int x=f.calculateTicketCost(noOfTickets);
		    	  
		    	  System.out.println("Total amount:"+x);
		    	  int s=f.availableTickets-noOfTickets;
		    	  System.out.println("Avilable ticket after booking:"+s);
		    	  f.availableTickets=s;
	}
	}
}
