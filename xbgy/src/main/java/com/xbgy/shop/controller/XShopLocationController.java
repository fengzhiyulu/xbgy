package com.xbgy.shop.controller;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopLocation;

/**
 * 快递地址
 * @author Administrator
 *
 */
public interface XShopLocationController {

	/**
	 * 添加一条快递订单
	 * @return
	 */
	public String addShopOrder(XShopCustom custom,XShopLocation location,String goodsId,Integer orderQty);
}
