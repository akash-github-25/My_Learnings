package com.que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PlayList p=new PlayList();
		System.out.println("Give value 1");
		String s1=sc.next();
		String s2=sc.next();
		Song s=new Song(s1,s2);
		 p.addSong(s);
		System.out.println("Give value 2");
		String s3=sc.next();
		String s4=sc.next();
		Song a=new Song(s3,s4);
		p.addSong(a);
		System.out.println("Give value 3");
		String s5=sc.next();
		String s6=sc.next();
		Song c=new Song(s5,s6);
		 p.addSong(c);
		System.out.println("Give value 4");
		String s7=sc.next();
		String s8=sc.next();
		Song d=new Song(s7,s8);
		p.addSong(d);
		
       
      
       s.play();
       
       a.play();
      
       c.play();
       
       d.play();
	}

}
