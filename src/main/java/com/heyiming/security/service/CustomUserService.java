package com.heyiming.security.service;

import com.heyiming.security.model.SysUser;
import com.heyiming.security.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {

	@Autowired
	private SysUserRepository sysUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = sysUserRepository.findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException("user does not exist. user name: " + username);
		}
		return user;
	}
}
