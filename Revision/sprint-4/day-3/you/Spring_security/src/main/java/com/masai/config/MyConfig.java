package com.masai.config;

import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfig {

    @Bean
    public InMemoryUserDetailsManager userDetails() {
    	InMemoryUserDetailsManager userDetails=new InMemoryUserDetailsManager();
    	UserDetails admin=User.withUsername("admin").password("123").authorities("admin").build();
    	userDetails.createUser(admin);
    	return userDetails;
    }
	
	@Bean
public SecurityFilterChain SecurityChain(HttpSecurity http) throws Exception{
	http.authorizeHttpRequests(
			(auth)-> auth.antMatchers("/student").hasAuthority("admin")
			.antMatchers("/getStudents").permitAll()
).httpBasic();
	return http.build();
}
	@Bean
	public PasswordEncoder encodePassword() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
