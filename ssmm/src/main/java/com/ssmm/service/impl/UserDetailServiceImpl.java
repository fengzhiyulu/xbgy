package com.ssmm.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ssmm.dao.UserMapper;
import com.ssmm.model.Role;
import com.ssmm.model.User;
import com.ssmm.service.UserDetailService;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailService {

	@Resource
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userMapper.selectByUserName(username);
		List<GrantedAuthority> authList = buildUserAuthority(user.getRoles());
		return buildUserForAuthentication(user, authList);
	}

	public List<GrantedAuthority> buildUserAuthority(List<Role> roles){
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		for (Role role : roles) {
			authList.add(new SimpleGrantedAuthority(role.getId().toString()));
		}
		return authList;
	}
	private org.springframework.security.core.userdetails.User buildUserForAuthentication(User user,List<GrantedAuthority> authorities){
		return new org.springframework.security.core.userdetails.User(user.getId().toString(),user.getPassword(),true,true,true,true,authorities);
	}
}

