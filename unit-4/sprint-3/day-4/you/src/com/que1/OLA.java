package com.que1;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack x=new HatchBack(numberOfPassenger,numberOfKMs);
			
		    
			return x;
		}else {
			Sedan s=new Sedan(numberOfPassenger,numberOfKMs);
			return s; 
		}
	}
	public int calculateBill(Car car) {
	
		if(car instanceof HatchBack) {
	   HatchBack h= (HatchBack)car; 
			
	   
	  
	   
	   int farePerKm=h.farePerKm;
//	   System.out.println();
//	   Car c=new Car();
	   int numberOfKms=h.getNumberOfKms();
//	   System.out.println();
//	   Car c= new Car();
	   
	   
//	   ;
//		OLA c=new OLA()
//		syso
//	   System.out.println(numberOfKms+"car");
		int TotalFare=numberOfKms*farePerKm;
		
		
		return TotalFare;
		}else if(car instanceof Sedan){
		Sedan h= (Sedan)car; 
		   
		   
		   int farePerKm=h.farePerKm;
		   int numberOfKms=h.getNumberOfKms();
//		   Car c= new Car();
//		   System.out.println(c.getNumberOfKms()+"car");
		   
//		   ;
//			OLA c=new OLA()
//			
			int TotalFare=numberOfKms*farePerKm;
			
			return TotalFare;
	}else {
		return -1;
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 HatchBack h=new HatchBack(); 
//		int farePerKm=h.farePerKm;
//		   System.out.println(farePerKm);
	}

}
