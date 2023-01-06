package com.que2;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium) {
		if(stadium==Stadium.EDEN_GARDENS_STADIUM) {
			System.out.println("This is the home ground of KKR\r\n"
					+ "");
		}else if(stadium==Stadium.CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of CSK\n"
					+ "");
		}else if(stadium==Stadium.M_CHINNASWAMY_STADIUM) {
			System.out.println("This is the home ground of RCB");
		}else if(stadium==Stadium.WANKHEDE_STADIUM) {
			System.out.println("This is the home ground of Mumbai Indians\r\n"
					+ "");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eden for kolkata,wankhede for mumbai,chidambaram for chennai,chinnaswamy for bangalore");
		IPL i=new IPL();
         String h=sc.next();
         if(h.equals("eden")) {
         Stadium h1=Stadium.EDEN_GARDENS_STADIUM;
         i.homeTeamStadium(h1);
         }else if(h.equals("wankhede")) {
        	 Stadium h1=Stadium.WANKHEDE_STADIUM;
        	 i.homeTeamStadium(h1); 
         }else if(h.equals("chinnaswamy")) {
        	 Stadium h1=Stadium.M_CHINNASWAMY_STADIUM;
        	 i.homeTeamStadium(h1); 
         }else if(h.equals("chidambaram")) {
        	 Stadium h1=Stadium.CHIDAMBARAM_STADIUM;
        	 i.homeTeamStadium(h1); 
         }
	}

}
