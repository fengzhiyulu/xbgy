package com.xbgy.shop.service;

import com.xbgy.shop.model.XShopCustom;

public interface XShopCustomService {

	public XShopCustom select(XShopCustom custom);
	
	public XShopCustom insert(XShopCustom custom);
	
	public XShopCustom selectOrInsert(XShopCustom custom);
}
