package com.ssmm.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import com.ssmm.dao.UrlMapper;
import com.ssmm.model.Url;

@Service("urlService")
public class UrlService implements FilterInvocationSecurityMetadataSource{

	@Resource
	private UrlMapper urlMapper;
	
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
		return getRoleByUrl(url);
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * 根据路径获取所有拥有权限的角色
	 * @param urlString
	 * @return
	 */
	public Collection<ConfigAttribute> getRoleByUrl(String urlString){
		Url url = urlMapper.getRoleByUrl(urlString);
		if(url != null && url.getPrivilege() != null){
			return url.getPrivilege().getRoleSet();
		}else{
			return null;
		}
	}

}
