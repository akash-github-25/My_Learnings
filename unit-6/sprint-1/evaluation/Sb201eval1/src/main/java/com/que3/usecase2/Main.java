package com.que3.usecase2;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.que3.bean.Account;
import com.que3.dao.AccountDao;
import com.que3.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao z=new AccountDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("give id");
		int id=sc.nextInt();
		System.out.println("give email");
		String ema=sc.next();
		System.out.println("give address");
		String add=sc.next();
		System.out.println("give balance");
		double bal=sc.nextInt();
		Account a=new Account(id,ema,add,bal);
		String x=z.save(a);
		System.out.println(x);
		
		

	}

}
