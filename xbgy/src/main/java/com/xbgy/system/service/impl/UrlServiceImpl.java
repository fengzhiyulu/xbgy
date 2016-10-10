package com.xbgy.system.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import com.xbgy.core.service.BaseServiceImpl;
import com.xbgy.system.dao.UrlDao;
import com.xbgy.system.model.Url;
import com.xbgy.system.service.UrlService;

@Service("urlService")
public class UrlServiceImpl extends BaseServiceImpl<Url> implements UrlService{

	@Resource
	private UrlDao urlDao;
	
	/**
	 * 根据路径获取所有拥有权限的角色
	 * @param urlString
	 * @return
	 */
	public Collection<ConfigAttribute> getRoleByUrl(String urlString){
		Url url = urlDao.getRoleByUrl(urlString);
		if(url != null && url.getPrivilege() != null){
			return url.getPrivilege().getRoleSet();
		}else{
			return null;
		}
	}

}
