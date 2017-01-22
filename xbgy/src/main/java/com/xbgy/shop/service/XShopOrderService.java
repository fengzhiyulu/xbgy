package com.xbgy.shop.service;

public interface XShopOrderService {

	/**
	 * 创建一个快递打印单信息
	 */
	public void insertOrder(String customId,String locId,String goodCode,Double orderQty);
}
