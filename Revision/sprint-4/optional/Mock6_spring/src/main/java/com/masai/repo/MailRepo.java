package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Mail;

public interface MailRepo extends JpaRepository<Mail, Integer>{

}
