package com.que3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.que3.bean.Account;

public class AccountDaoImpl implements AccountDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		Account s1=em.find(Account.class, id);
		if(s1!=null) {
			return s1;
		}
		em.close();
		return null;
		
	}

	@Override
	public String save(Account account) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		Account e=new Account(account.getId(),account.getEmail(),account.getAddress(),account.getBalance());
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		return "Account added";
	}

	@Override
	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		Account s1=em.find(Account.class, id);
		if(s1!=null) {
			em.getTransaction().begin();
			em.remove(s1);
			em.getTransaction().commit();
		}
		return "Account deleted";
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		Account s1=em.find(Account.class, accountId);
		if(s1==null) {
			return "Account not present";
		}else {
			em.getTransaction().begin();
			s1.setBalance(amount-s1.getBalance());
			return "Amount withdrawn";
		}
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		Account s1=em.find(Account.class, accountId);
		if(s1==null) {
			return "Account not present";
		}else {
			em.getTransaction().begin();
			s1.setBalance(amount+s1.getBalance());
			return "Balance updated";
		}
	}

}
