package com.xbgy.shop.service;

import com.xbgy.shop.controller.impl.subType.OrderInfo;
import com.xbgy.shop.model.XShopOrder;

public interface XShopOrderService {

	/**
	 * 创建一个快递打印单信息
	 */
	public XShopOrder createOrder(OrderInfo orderInfo);
}
