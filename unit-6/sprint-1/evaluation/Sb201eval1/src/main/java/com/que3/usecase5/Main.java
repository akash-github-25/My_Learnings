package com.que3.usecase5;

import java.util.Scanner;

import com.que3.dao.AccountDao;
import com.que3.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao z=new AccountDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("give amount");
		int amt=sc.nextInt();
		System.out.println("give id");
		int id=sc.nextInt();
		
		
		String z1=z.deposit(amt, id);
		System.out.println(z1);

	}

}
