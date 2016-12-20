package com.xbgy.shop.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import com.xbgy.core.dao.Condition;
import com.xbgy.shop.model.BaseObject;
import com.xbgy.system.dao.AccountDao;

public abstract class XShopBaseService {
	
	@Resource
	public AccountDao accountDao;
	public static String getNowTimeString(){
		return new SimpleDateFormat("yyyymmddHHmmss").format(new Date());
	}
	
	public static String getUserId(){
		return "zhangsan";					//TODO 获取当前用户
	}
	
	public static boolean isEmpty(Object obj){	//TODO 判断是否为空
		
		return true;
	}
	
	public void select(Class<? extends BaseObject> clazz,Condition cond){
		try {
			BaseObject newInstance = clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountDao.insert(null);
	}
}
