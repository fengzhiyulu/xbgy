package com.xbgy.shop.service;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopLocation;

public interface XShopOrderService {

	/**
	 * 创建一个快递打印单信息
	 */
	public void insertOrder(XShopCustom custom,XShopLocation location,String goodsId,Integer orderQty);
}
