package com.one;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A1: 5,A2: 7,A3: 9,B1: 3,B2: 8,B3: =4+5,C1: =5+A1,C2: =A2+B2,C3: =C2+B3";
       Map<String,Integer> map=new HashMap<>();
       
		String[] ans=str.split(",");
        for(String s:ans) {
        	String[] s1=s.split(": ");
        	 if(s1[1].charAt(0)!='=') {
        		 map.put(s1[0],Integer.parseInt(s1[1]));
        	 }
        	
        	if(s1[1].charAt(0)=='=') {
        	    String h1=s1[1].substring(1,s1[1].length());
//        	    System.out.println(h1.length());
        		String[] h=h1.split("");
            String z1,z2,z3;
        		if(h.length==3) {
            	 z1=h[0];
            	 z2=h[2];
             }else if(h.length==4) {
            	 z1=h[0];
            	 z2=h[2]+h[3];
             }else {
            	 z1=h[0]+h[1];
            	 z2=h[3]+h[4];
            	 }
//        		System.out.println(z1+" "+z2);

        		Integer x1=0;
        		Integer y1=0;
        		
        		if(z1.equals("A1") || z1.equals("A2") || z1.equals("A3")
        				|| z1.equals("B1")|| z1.equals("B2")|| z1.equals("B3")
        				|| z1.equals("C1")|| z1.equals("C2")|| z1.equals("C3")) {
        			
        			 x1=map.get(z1);
        		}else {
        			 x1=Integer.parseInt(z1);
        		}
        	if(z2.equals("A1") || z2.equals("A2") || z2.equals("A3")
    				|| z2.equals("B1")|| z2.equals("B2")|| z2.equals("B3")
    				|| z2.equals("C1")|| z2.equals("C2")|| z2.equals("C3")) {
        		
        		y1=map.get(z2);
        	}else {
        	 y1=Integer.parseInt(z2);
        	}
        				
        				
        		map.put(s1[0],x1+y1);
        	}
        }
        for(Map.Entry<String,Integer> b:map.entrySet()) {
        	System.out.println(b.getKey()+" "+b.getValue());
        }
		
	}

}
