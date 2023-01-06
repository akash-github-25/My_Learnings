package com.que3;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets!=0) {
			
//	    	  availableTickets=availableTickets-1;
	    	  System.out.println("Available tickets:"+availableTickets);
	    	  int totalAmount= noOfTickets*price;
	    	  
	    	  return totalAmount;
	      }else{
	    	  return -1;
	      }

	}
		// TODO Auto-generated method stub
		
	}


