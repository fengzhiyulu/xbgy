package com.xbgy.shop.controller;

import com.xbgy.shop.controller.impl.subType.OrderInfo;

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
	public String addShopOrder(OrderInfo orderInfo);
}
