package com.que1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
public static void main(String[] args) throws IOException {
	File f=new File("c://Files");
	f.mkdir(); //to create folder
	
	System.out.println(f.exists()); //true
	if(f.exists()) {
		File f1=new File("c://Files://newFile.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		PrintWriter p=new PrintWriter("c://Files://newFile");
		p.println("akash");
		System.out.println("done");
	}
	
	System.out.println("NOT WORKING");
}
}
