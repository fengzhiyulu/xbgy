package com.xbgy.shop.service;

import java.util.List;

import com.xbgy.shop.model.XShopCustom;

public interface XShopCustomService {

	public List<XShopCustom> select(String customName);
	
	public void insert(XShopCustom custom);
	
	public XShopCustom selectOrInsert(XShopCustom custom);
}
