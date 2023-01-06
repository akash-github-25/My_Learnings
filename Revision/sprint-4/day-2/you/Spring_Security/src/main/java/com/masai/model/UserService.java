package com.masai.model;

import java.util.Optional;

public interface UserService {
public Integer saveUser(User user);
public Optional<User> findByUsername(String username);
}
