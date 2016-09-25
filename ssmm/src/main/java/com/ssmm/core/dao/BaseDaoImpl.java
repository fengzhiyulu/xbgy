package com.ssmm.core.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	
	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	@Override
	public void insert(T t) {
		// TODO Auto-generated method stub
		getSqlSession().update(clazz.getName(), t);
	}

	@Override
	public void insertBatch(List<T> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	public Class clazz;
}
