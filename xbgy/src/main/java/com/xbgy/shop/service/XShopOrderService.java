package com.xbgy.shop.service;

public interface XShopOrderService {

	/**
	 * ����һ����ݴ�ӡ����Ϣ
	 */
	public void insertOrder(String customId,String locId,String goodCode,Double orderQty);
}
