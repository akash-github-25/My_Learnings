package com.que2;

import java.util.Scanner;

public class Demo {
	Hotel ht=null;
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			ht=new TajHotel();
//			return ht;
		}else if(amount>200 && amount<1000) {
			ht= new RoadSideHotel();
//			return ht;
		}
		
		return ht;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Put the value of amount");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		Demo d=new Demo();
		Hotel h=d.provideFood(amt);
		
		if(h!=null) {
			if(h instanceof TajHotel) {
				TajHotel t=(TajHotel)h;
				t.welcomeDrink();
			}else if(h instanceof RoadSideHotel) {
				RoadSideHotel r=(RoadSideHotel)h;
				r.welcomedrinkRoadSide();
			}
		}else {
			System.out.println("Please Enter a valid amount;");
		}

	}

}
