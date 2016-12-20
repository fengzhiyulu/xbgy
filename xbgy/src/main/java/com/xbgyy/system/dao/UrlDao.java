package com.xbgyy.system.dao;

import com.xbgyy.system.model.Url;

public interface UrlDao {
    int deleteByPrimaryKey(Integer urlid);

    int insert(Url record);

    int insertSelective(Url record);

    Url selectByPrimaryKey(Integer urlid);

    int updateByPrimaryKeySelective(Url record);

    int updateByPrimaryKey(Url record);
}