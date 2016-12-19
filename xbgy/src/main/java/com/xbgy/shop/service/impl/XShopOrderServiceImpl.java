package com.xbgy.shop.service.impl;

import com.xbgy.shop.controller.impl.subType.OrderInfo;
import com.xbgy.shop.model.XShopOrder;
import com.xbgy.shop.service.XShopBaseService;
import com.xbgy.shop.service.XShopOrderService;
import com.xbgy.shop.util.Const;

public class XShopOrderServiceImpl extends XShopBaseService implements XShopOrderService{

	public XShopOrder createOrder(OrderInfo orderInfo) {
		XShopOrder order = buildOrder(orderInfo);
		
		return order;
	}
	
	public void updateOrder(){
		
	}
	
	public void deleteOrder(){
		
	}
	public void viewOrders(){
		
	}
	
	private XShopOrder buildOrder(OrderInfo orderInfo){
		XShopOrder order = new XShopOrder();
		order.setOrderId("");						//TODO 构造一个快递订单号
		order.setGoodsId(orderInfo.getGoodsId());
		order.setOrderQty(orderInfo.getOrderQty());
		order.setOrderStatus(Const.Order_Status_New);
		order.setCreateTime(getNowTimeString());
		order.setCreateUser(getUserId());
		return order;
	}
}
