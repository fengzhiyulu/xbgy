package com.ssmm.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import com.ssmm.dao.UrlMapper;
import com.ssmm.model.Url;
import com.ssmm.service.UrlService;

@Service("urlService")
public class UrlServiceImpl implements UrlService{

	@Resource
	private UrlMapper urlMapper;
	
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
