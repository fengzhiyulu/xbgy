package com.xbgy.core.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T , PK extends Serializable> {

	public Integer insert(T t);
	
	public Integer insertSelective(T t);
	
	public Integer insert(String method , Object enity);
	
	public Integer update(T t);
	
	public Integer update(String method , Object enity);
	
	public Integer updateByPrimaryKeySelective(T t);
	
	public Integer delete(PK id);
	
	public Integer delete(String method , Object enity);
	
	public T selectByPrimaryKey(PK id);
	
	public List<T> selectList();
}
