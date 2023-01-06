package com.que3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Sort implements Comparator<Members> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	@Override
	public int compare(Members b1, Members b2) {
		// TODO Auto-generated method stub
//		if(o1.membershipEnddate>o2.membershipEnddate) {
//			return 1;
//		}else {
//			return -1;
//		}
//		Members b1=(Members)this;
//		   Members b2=(Members)obj;
		   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		   LocalDate date1 = LocalDate.parse(b1.membershipEnddate, dtf);
		   LocalDate date2 = LocalDate.parse(b2.membershipEnddate, dtf);
		   if(date1.isBefore(date2)) {
			   return -1;
		   }else {
			   return 1;
		   }
	}

}
