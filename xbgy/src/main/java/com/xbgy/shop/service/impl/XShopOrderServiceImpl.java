package com.xbgy.shop.service.impl;

import java.util.Map;

import com.xbgy.core.dao.Condition;
import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopLocation;
import com.xbgy.shop.model.XShopOrder;
import com.xbgy.shop.service.XShopBaseService;
import com.xbgy.shop.service.XShopOrderService;
import com.xbgy.shop.util.CommonUtil;
import com.xbgy.shop.util.Const;

public class XShopOrderServiceImpl extends XShopBaseService implements XShopOrderService{
	
	public void insertOrder(XShopCustom custom,XShopLocation location,String goodsId,Integer orderQty) {
		XShopOrder order = buildOrder(custom.getCustomId(),location.getLocId(),goodsId,orderQty);
																											//TODO 插入一条order
	}
	
	public void updateOrder(){
		
	}
	
	public void deleteOrder(){
		
	}
	public void viewOrders(){
		
	}
	public XShopCustom getCustomInfo(Map<String,String> cond){
		
		
		return null;
	}
	
	/**
	 * 
	 * @param orderId
	 * @param customId
	 * @param goodsId
	 * @param orderQty
	 * @return
	 */
	private XShopOrder buildOrder(String customId,String locId,String goodsId,Integer orderQty){
		XShopOrder order = new XShopOrder();
		order.setOrderId(CommonUtil.getOrderId());						//TODO 构造一个快递订单号
		order.setCustomId(customId);
		order.setLocId(locId);
		order.setGoodsId(goodsId);
		order.setOrderQty(orderQty);
		order.setOrderStatus(Const.Order_Status_New);
		order.setCreateTime(getNowTimeString());
		order.setCreateUser(getUserId());
		return order;
	}
	
	
}
