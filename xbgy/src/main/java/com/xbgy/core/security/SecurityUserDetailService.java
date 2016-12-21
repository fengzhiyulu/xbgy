package com.xbgy.core.security;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.xbgy.system.service.AccountService;

/**
 * 
 * @author Grubby
 *
 */
@Component("securityUserDetailService")
public class SecurityUserDetailService implements UserDetailsService{
	
	@Resource
	private AccountService accountService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return accountService.getAccountWithRolesByUsername(username);
	}

}
