package com.xbgy.shop.controller.impl.subType;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopGood;
import com.xbgy.shop.model.XShopLocation;

/**
 * ��ݱ���Ϣ
 * @author Administrator
 *
 */
public class OrderInfo {
	
	private XShopCustom custom;				//�ͻ�
	private XShopLocation location;			//λ��
	private XShopGood good;					//��Ʒ
	private Integer orderQty;			//����
	
	public XShopCustom getCustom() {
		return custom;
	}
	public void setCustom(XShopCustom custom) {
		this.custom = custom;
	}
	public XShopLocation getLocation() {
		return location;
	}
	public void setLocation(XShopLocation location) {
		this.location = location;
	}
	public XShopGood getGood() {
		return good;
	}
	public void setGood(XShopGood good) {
		this.good = good;
	}
	public Integer getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}
}
