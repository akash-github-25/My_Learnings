package com.ExceptionClass;

import java.util.Scanner;

public class SimpleProgram {

	public static void main(String[] args) throws SomeSeriousProblemOccuredException {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner(System.in);
			//some statements throwing SomeSeriousProblemOccuredException;
			System.out.println("Provide your string!");
			String str=scanner.next();
			
			try {
				int d=100/0;
				if(str.equals("akash")) {
					throw new SomeSeriousProblemOccuredException("problem!");
				}else {
					System.out.println(str);
				}
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}finally {
				if(scanner!=null) {
				scanner.close();
				}
			}
			


	}

}
