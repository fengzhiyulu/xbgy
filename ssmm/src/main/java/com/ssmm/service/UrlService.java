package com.ssmm.service;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

import com.ssmm.core.service.BaseService;
import com.ssmm.model.Url;

public interface UrlService extends BaseService<Url>{
	
	public Collection<ConfigAttribute> getRoleByUrl(String urlString);
	
}
