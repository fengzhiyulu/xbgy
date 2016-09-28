package com.ssmm.service;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

import com.ssmm.model.Url;
import com.xbgy.core.service.BaseService;

public interface UrlService extends BaseService<Url>{
	
	public Collection<ConfigAttribute> getRoleByUrl(String urlString);
	
}
