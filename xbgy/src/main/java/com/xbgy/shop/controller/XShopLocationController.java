package com.xbgy.shop.controller;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopLocation;

/**
 * ��ݵ�ַ
 * @author Administrator
 *
 */
public interface XShopLocationController {

	/**
	 * ���һ����ݶ���
	 * @return
	 */
	public String addShopOrder(XShopCustom custom,XShopLocation location,String goodsId,Integer orderQty);
}
