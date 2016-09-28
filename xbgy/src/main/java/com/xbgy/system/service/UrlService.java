package com.xbgy.system.service;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

import com.xbgy.core.service.BaseService;
import com.xbgy.system.model.Url;

public interface UrlService extends BaseService<Url>{
	
	public Collection<ConfigAttribute> getRoleByUrl(String urlString);
	
}
