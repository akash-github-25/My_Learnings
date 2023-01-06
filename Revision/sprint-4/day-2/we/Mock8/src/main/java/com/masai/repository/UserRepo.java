package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
