package com.que5;

import java.util.Scanner;

public class UserRegistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done\r\n"
					+ "successfully");
			
		}else {
			InvalidCountryException ac=new InvalidCountryException("User Outside India cannot be registered");
			throw ac;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("give username");
		String s=sc.next();
		System.out.println("give country");
		String c=sc.next();
		try {
		UserRegistration u=new UserRegistration();
		u.registerUser(s,c);
		}catch(InvalidCountryException x) {
			System.out.println(x.getMessage());
		}
		System.out.println("Thank you!");

	}

}
