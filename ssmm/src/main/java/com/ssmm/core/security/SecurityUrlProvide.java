package com.ssmm.core.security;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import com.ssmm.service.UrlService;

@Component("securityUrlProvide")
public class SecurityUrlProvide implements FilterInvocationSecurityMetadataSource{

	@Resource
	private UrlService urlService;
	
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ConfigAttribute> getAttributes(Object obj) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		FilterInvocation filterInvocation = (FilterInvocation)obj;
		String url = filterInvocation.getRequest().getServletPath();
		return urlService.getRoleByUrl(url);
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
