package com.que3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws LowBalanceException, ServerDownException, IOException {
		List<BankAccount> bacc=new ArrayList<>();
		BankAccount ba=new BankAccount();
		ba.setName("akash");
		ba.setAccno("12345");
		ba.setAmount(100);
		bacc.add(ba);
		Scanner sc=new Scanner(System.in);
		System.out.println("Give accno");
		String accNo=sc.next();
		System.out.println("Give amount to withdraw");
		int amount=sc.nextInt();
		int take=0;
		for(int i=0;i<bacc.size();i++) {
		if(accNo.equals(bacc.get(i).getAccno())) {
			
			take=1;
			if(amount>bacc.get(i).getAmount()) {
				throw new LowBalanceException("Amount is less");
			}else {
				bacc.get(i).setAmount(bacc.get(i).getAmount()-amount);
			}
				
		}
		}
		if(take==0) {
			throw new ServerDownException("Not able to fetch data!");
		}
//		try {
//			File file = new File("a1.txt");
//			if (file.createNewFile()) {
//			System.out.println("New File is created!");
//			} else {
//			System.out.println("File already exists.");
//			}
//			} catch (IOException e) {
//			e.printStackTrace();
//			}
		PrintWriter out=new PrintWriter("a1.txt");

		for(int j=0;j<bacc.size();j++) {
		out.println(bacc.get(j).getName());
		out.println(bacc.get(j).getAccno());
		out.println(bacc.get(j).getAmount());
		out.close();
		System.out.println("done..");
		}
		
		FileReader fr=new FileReader("a1.txt");
		BufferedReader br=new BufferedReader(fr);

		

		String line=br.readLine();
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();
		
		
	}

}
