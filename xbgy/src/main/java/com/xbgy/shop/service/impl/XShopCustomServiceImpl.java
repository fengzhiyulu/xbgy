package com.xbgy.shop.service.impl;

import java.util.List;

import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.service.XShopBaseService;
import com.xbgy.shop.service.XShopCustomService;

public class XShopCustomServiceImpl extends XShopBaseService implements XShopCustomService{

	@Override
	public List<XShopCustom> select(String customName) {
		
		return null;
	}

	@Override
	public void insert(XShopCustom custom) {
	}

	@Override
	public XShopCustom selectOrInsert(XShopCustom custom) {
		return null;
	}
}
