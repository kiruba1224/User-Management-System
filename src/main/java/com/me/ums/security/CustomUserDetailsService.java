package com.me.ums.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.me.ums.repo.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException 
	{
		return userRepo.findByUserName(userName).map(user -> new CustomUserDetails(user))
				.orElseThrow(()-> new UsernameNotFoundException("Failed to authenticate the user."));

	}
}

