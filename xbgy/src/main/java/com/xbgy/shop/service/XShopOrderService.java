package com.xbgy.shop.service;

import com.xbgy.shop.controller.impl.subType.OrderInfo;
import com.xbgy.shop.model.XShopOrder;

public interface XShopOrderService {

	/**
	 * ����һ����ݴ�ӡ����Ϣ
	 */
	public XShopOrder createOrder(OrderInfo orderInfo);
}
