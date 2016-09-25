package com.ssmm.service;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

public interface UrlService {
	
	public Collection<ConfigAttribute> getRoleByUrl(String urlString);
	
}
