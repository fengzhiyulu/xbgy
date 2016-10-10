package com.xbgy.system.dao;

import java.io.Serializable;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Url;

public interface UrlDao extends BaseDao<Url, Serializable>{

	public Url getRoleByUrl(String url);	//根据url 获取所有的角色 url对象的privilege的roleset里面
}
