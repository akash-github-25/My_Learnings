package com.masai.service;

import com.masai.bean.Mail;
import com.masai.exception.MailException;

import javax.validation.constraints.Email;

public interface MailService {
public Mail addEmail(Mail mail)throws MailException;
public Mail deleteMail(Integer mailId)throws MailException;
public Mail updateMailaddStarred(Mail mail)throws MailException;
}
