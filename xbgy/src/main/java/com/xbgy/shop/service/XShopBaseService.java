package com.xbgy.shop.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XShopBaseService {
	
	public static String getNowTimeString(){
		return new SimpleDateFormat("yyyymmddHHmmss").format(new Date());
	}
	
	public static String getUserId(){
		return "zhangsan";					//TODO 获取当前用户
	}
}
