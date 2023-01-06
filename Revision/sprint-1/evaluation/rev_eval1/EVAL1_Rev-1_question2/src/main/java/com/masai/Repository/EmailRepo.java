package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Email;

public interface EmailRepo extends JpaRepository<Email, Integer>{

}
