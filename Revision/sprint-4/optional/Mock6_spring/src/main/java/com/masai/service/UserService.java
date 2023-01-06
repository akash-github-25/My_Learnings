package com.masai.service;

import java.util.List;

import com.masai.bean.Mail;
import com.masai.bean.User;
import com.masai.exception.MailException;
import com.masai.exception.UserException;

public interface UserService {
	
 public User addUser(User user)throws UserException;
 public List<Mail> getAllMails(Integer userId)throws MailException;
 public User updateUser(User user)throws UserException;
 public List<Mail> getStarredMails(Integer userId)throws MailException;
 
}
