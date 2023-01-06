package com.que1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=new PrintWriter("abc.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee name");
		out.println(sc.next());
		sc.nextLine();
		System.out.println("Employee address");
		out.println(sc.nextLine());
		out.close();
		System.out.println("done..");

	}

}
