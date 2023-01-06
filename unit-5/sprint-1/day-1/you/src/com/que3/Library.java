package com.que3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Library{
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
	   Members b1=(Members)this;
	   Members b2=(Members)obj;
	   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	   LocalDate date1 = LocalDate.parse(b1.membershipEnddate, dtf);
	   LocalDate date2 = LocalDate.parse(b2.membershipEnddate, dtf);
	   if(date1.isBefore(date2)) {
		   return true;
	   }else {
		   return false;
	   }
	   
	   
		
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      
	}

}
  