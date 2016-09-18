package com.ssmm.dao;

import com.ssmm.model.Url;

public interface UrlMapper {

	public Url getRoleByUrl(String url);	//根据url 获取所有的角色 url对象的privilege的roleset里面
}
