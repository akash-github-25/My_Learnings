package com.que3.usecase1;

import java.util.Scanner;

import com.que3.bean.Account;
import com.que3.dao.AccountDao;
import com.que3.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AccountDao f=new AccountDaoImpl();
		System.out.println("Enter id");
		int id=sc.nextInt();
		Account a=f.findById(id);
		System.out.println(a);
		

	}

}
