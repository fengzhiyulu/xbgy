package com.xbgy.system.dao;

import java.io.Serializable;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Url;

public interface UrlDao extends BaseDao<Url, Serializable>{

	public Url getRoleByUrl(String url);	//����url ��ȡ���еĽ�ɫ url�����privilege��roleset����
}
