package com.xbgy.shop.controller;

import com.xbgy.shop.controller.impl.subType.OrderInfo;

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
	public String addShopOrder(OrderInfo orderInfo);
}
