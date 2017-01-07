package com.xbgy.shop.service.impl;

import com.xbgy.shop.model.XShopOrder;
import com.xbgy.shop.service.XShopBaseService;
import com.xbgy.shop.service.XShopOrderService;
import com.xbgy.shop.util.CommonUtil;
import com.xbgy.shop.util.Const;

public class XShopOrderServiceImpl extends XShopBaseService implements XShopOrderService{
	
	public void insertOrder(String customId,String locId,String goodCode,Double orderQty) {
		XShopOrder order = buildOrder(customId, locId, goodCode, orderQty);
		
	}
	
	public void updateOrder(){
		
	}
	
	public void deleteOrder(){
		
	}
	public void viewOrders(){
		
	}
	
	/**
	 * 
	 * @param orderId
	 * @param customId
	 * @param goodCode
	 * @param orderQty
	 * @return
	 */
	private XShopOrder buildOrder(String customId,String locId,String goodCode,Double orderQty){
		XShopOrder order = new XShopOrder();
		order.setOrderId(CommonUtil.getOrderId());						//TODO ����һ����ݶ�����
		order.setCustomId(customId);
		order.setLocId(locId);
		order.setGoodCode(goodCode);
		order.setOrderQty(orderQty);
		order.setOrderStatus(Const.Order_Status_New);
		order.setCreateTime(getNowTimeString());
		order.setCreateUser(getUserId());
		return order;
	}
	
	
}
