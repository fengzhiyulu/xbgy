package com.xbgy.system.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.xbgy.core.dao.BaseDaoImpl;
import com.xbgy.system.dao.UrlDao;
import com.xbgy.system.model.Url;

@Repository("UrlDao")
public class UrlDaoImpl extends BaseDaoImpl<Url, Serializable> implements UrlDao{

	@Override
	public Url getRoleByUrl(String url) {
		return getSqlSession().getMapper(UrlDao.class).getRoleByUrl(url);
	}

}
