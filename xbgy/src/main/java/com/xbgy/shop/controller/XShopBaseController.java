package com.xbgy.shop.controller;

import javax.annotation.Resource;

import com.xbgy.shop.service.XShopCustomService;

/**
 * ��ݵ�ַ
 * @author Administrator
 *
 */
public class XShopBaseController {
	
	//@Resource
	public XShopCustomService customService;
	
	public static boolean isEmpty(Object obj){
		
		return true;
	}
}
