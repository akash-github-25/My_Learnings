package com.masai1;

public class prime {
   public void pri(int N) {
	   String bag="";
	   for(int i=1;i<=N;i++) {
		   if(N>2 && N<100) {
		   if(N % i == 0) {
			   bag=bag+i+" ";
		   }
		   }else {
			   System.out.println("Invalid number");  
		   }
	   }
	   System.out.println(bag);
   }
	public static void main(String[] args) {
		prime d=new prime();
				d.pri(12);

	}

}



