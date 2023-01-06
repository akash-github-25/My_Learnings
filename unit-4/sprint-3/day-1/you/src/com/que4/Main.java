package com.que4;

public class Main {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      if(args.length>2) {
    	  System.out.println("Error");
      }else if(args.length==1) {
//    	  System.out.println("yes");
    	  int pro=1;
    	  int v=Integer.parseInt(args[0]);
    	  for(int i=v;i>=1;i--) {
    		  pro=pro*i;
    	  }
        System.out.println(pro);
      }else if(args.length==2){
    	  int v1=Integer.parseInt(args[0]);  
    	  int v2=Integer.parseInt(args[1]);  
    	  int we=Math.abs(v1-v2);
    	  int pro=1;
    	  for(int i=we;i>=1;i--) {
//    		  int v=Integer.parseInt(i);  
    		  pro=pro*i;
    	  }
    	  System.out.println(pro);
    	  
      }
	}

}
