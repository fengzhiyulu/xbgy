package com.xbgy.core.security;

import java.util.Collection;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("securityAccessDecisionManager")
public class RoleAccessDecisionManager implements AccessDecisionManager{

	@Override
	public void decide(Authentication auth, Object obj, Collection<ConfigAttribute> config)
			throws AccessDeniedException, InsufficientAuthenticationException {
		// TODO Auto-generated method stub
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		
		//如果用户的角色 与 url的角色 相匹配
		for (GrantedAuthority grantedAuthority : authorities) {
			for (ConfigAttribute configAttribute : config) {
				if(grantedAuthority.getAuthority().equals(configAttribute.getAttribute()))
					return;
			}
		}
		
		//匹配失败
		throw new AccessDeniedException("权限越界");
	}

	@Override
	public boolean supports(ConfigAttribute config) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

}
