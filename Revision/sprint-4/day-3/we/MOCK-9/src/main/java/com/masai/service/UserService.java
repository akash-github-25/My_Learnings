package com.masai.service;

import java.util.List;

import com.masai.Exception.FirException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.Fir;
import com.masai.bean.User;

public interface UserService {
public User registerUser(User user)throws UserException;
public List<Fir> getAllFirs(Integer userId,String key)throws UserException,LoginException;
public Fir deleteFir(Integer userId,Integer firId)throws UserException,FirException;


}
