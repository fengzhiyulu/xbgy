package com.xbgy.core.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
public abstract class BaseDaoImpl<T , PK extends Serializable> extends SqlSessionDaoSupport implements BaseDao<T,PK>{
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	private final String POSTFIX = "Dao";  
	  
    private final String _INSERT = ".insert";  
  
    private final String _INSERTSELECTIVE = ".insertSelective";  
  
    private final String _SELECTBYPRIMARYKEY = ".selectByPrimaryKey";  
  
    private final String _UPDATEBYPRIMARYKEY = ".updateByPrimaryKey";  
  
    private final String _UPDATEBYPRIMARYKEYSELECTIVE = ".updateByPrimaryKeySelective";  
  
    private final String _DELETEBYPRIMARYKEY = ".deleteByPrimaryKey";  
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		String name = this.getClass().getName();
		ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
		mapperName = name.replace("Impl", "").replace(".impl", "");
	}

	@Override
	public Integer insert(T t) {
		// TODO Auto-generated method stub
		return getSqlSession().insert(mapperName + _INSERT, t);
	}

	@Override
	public Integer insertBatch(List<T> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(T t) {
		return getSqlSession().update(mapperName + _UPDATEBYPRIMARYKEY, t);
	}
	
	@Override
	public Integer insertSelective(T t) {
		// TODO Auto-generated method stub
		return getSqlSession().insert(mapperName + _INSERTSELECTIVE, t);
	}

	@Override
	public Integer updateByPrimaryKeySelective(T t) {
		// TODO Auto-generated method stub
		return getSqlSession().insert(mapperName + _UPDATEBYPRIMARYKEYSELECTIVE, t);
	}

	@Override
	public Integer delete(PK id) {
		return getSqlSession().delete(mapperName + _DELETEBYPRIMARYKEY, id);
	}
	
	@Override
	public T selectByPrimaryKey(PK id) {
		//System.out.println("******" + mapperName);
		return getSqlSession().selectOne(mapperName + _SELECTBYPRIMARYKEY,id);
	}
	
	@Override
	public List<T> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> clazz;
	private String mapperName;

	public String getMapperName() {
		return mapperName;
	}
	public void setMapperName(String mapperName) {
		this.mapperName = mapperName;
	}
}
