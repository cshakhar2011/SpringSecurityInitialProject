package com.nt.config;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.nt.entity.UserEntity;

public class CustomUserDetails implements UserDetails {
	
	@Autowired
	private UserEntity userEntity;
	
	
	public CustomUserDetails(UserEntity userEntity) {
		super();
		this.userEntity = userEntity;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(userEntity.getUserName());
		//List.of(()->"read")
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		
		return userEntity.getUserPass();
	}

	@Override
	public String getUsername() {
	
		return userEntity.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
	
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
