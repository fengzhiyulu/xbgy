package com.xbgy.shop.service;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopLocation;

public interface XShopOrderService {

	/**
	 * ����һ����ݴ�ӡ����Ϣ
	 */
	public void insertOrder(XShopCustom custom,XShopLocation location,String goodsId,Integer orderQty);
}
