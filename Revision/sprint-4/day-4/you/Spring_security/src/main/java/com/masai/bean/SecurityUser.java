package com.masai.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser implements UserDetails{
    
	private Student student;
    public SecurityUser(Student student) {
    	this.student=student;
    }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		
		List<GrantedAuthority> grantedAuthorities=new ArrayList<>();
		SimpleGrantedAuthority grantedAuthority=new SimpleGrantedAuthority(student.getEmail());
		grantedAuthorities.add(grantedAuthority);
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
//		return student.getStudentId()+"";
		return "1";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
//		return student.getEmail();
		return "ak@25";
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
