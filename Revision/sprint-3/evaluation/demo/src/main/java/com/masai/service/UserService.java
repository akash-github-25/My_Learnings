package com.masai.service;

import com.masai.Exception.UserException;
import com.masai.bean.User;


public interface UserService {
public User addUser(User user) throws UserException;
}
