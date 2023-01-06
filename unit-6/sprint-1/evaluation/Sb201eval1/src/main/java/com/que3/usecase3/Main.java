package com.que3.usecase3;

import java.util.Scanner;

import com.que3.dao.AccountDao;
import com.que3.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao z=new AccountDaoImpl();
  Scanner sc=new Scanner(System.in);
  int v=sc.nextInt();
  String w=z.deleteAccountById(v);
  System.out.println(w);
	}

}
