package com.masai.model;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService,UserDetailsService{
     @Autowired
	private UserRepository ur;
     @Autowired
     private PasswordEncoder pwdEncoder;
	@Override
	public Integer saveUser(User user) {
		user.setPassword(pwdEncoder.encode(user.getPassword()));
		return ur.save(user).getId();
	}
	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return ur.findByUsername(username);

}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> opt=findByUsername(username);
		if(opt.isEmpty()) {
			throw new UsernameNotFoundException("user not present");
		}
		User user=opt.get();
		return new org.springframework.security.core.userdetails.User(username, user.getPassword()
				,user.getRoles().stream().map(role->new SimpleGrantedAuthority(role)).collect(Collectors.toList())
				);
	}
}
