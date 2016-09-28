package com.xbgy.core.dao;

import java.util.List;

public interface BaseDao<T> {

	public void insert(T t);
	
	public void insertBatch(List<T> list);
	
	public void update(T t);
	
	public void delete(T t);
}
