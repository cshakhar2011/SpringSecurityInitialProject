package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.nt.entity.UserEntity;
import com.nt.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired(required=true)
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		// how Fatching Database
		
		UserEntity userName = userRepository.getUserByUserName(username);
		if(userName==null)
		{
			throw new UsernameNotFoundException("User Name is Not Found...");
		}
		
			CustomUserDetails customUserDetails=new CustomUserDetails(userName);
		
		
		
		return customUserDetails;
	}

}
