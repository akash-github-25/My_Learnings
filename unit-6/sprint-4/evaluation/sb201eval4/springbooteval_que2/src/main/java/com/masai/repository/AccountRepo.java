package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
