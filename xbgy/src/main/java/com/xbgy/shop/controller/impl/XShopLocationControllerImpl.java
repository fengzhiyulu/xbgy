package com.xbgy.shop.controller.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xbgy.shop.controller.XShopBaseController;
import com.xbgy.shop.controller.XShopLocationController;
import com.xbgy.shop.model.XShopCustom;
import com.xbgy.shop.model.XShopGood;
import com.xbgy.shop.model.XShopLocation;
import com.xbgy.shop.service.XShopOrderService;

@Controller
@RequestMapping("/express")
public class XShopLocationControllerImpl extends XShopBaseController implements XShopLocationController{

	@Resource
	private XShopOrderService orderService;
	
	@RequestMapping(value = "test" ,method = RequestMethod.GET)
	public String addShopOrder(XShopCustom custom,XShopLocation location,XShopGood good,Double orderQty) {
		if(isEmpty(custom.getCustomId())){					//
			custom = customService.selectOrInsert(custom);
		}
		if(isEmpty(location.getLocId())){
		}
		orderService.insertOrder(custom.getCustomId(), location.getLocId(), good.getGoodCode(),orderQty);
		return null;
	}

}
