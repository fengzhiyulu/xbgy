package com.xbgy.core.dao;

public class Condition {
	
	public Condition addFilter(String leftOption,Object rightOption){
		return addFilter(leftOption,"=",rightOption);
	}
	
	public Condition addFilter(String leftOption,String compare,Object rightOption){
		return this;
	}
}
