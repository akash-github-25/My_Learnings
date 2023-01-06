package com.masai.service;

import com.masai.Exception.LoginException;
import com.masai.bean.LoginDTO;
//import com.masai.exception.LoginException;

public interface LoginService {
	public String logIntoAccount(LoginDTO dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;
}
