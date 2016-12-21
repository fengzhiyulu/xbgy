package com.xbgy.core.dao;

import java.util.ArrayList;
import java.util.List;

import com.xbgy.core.utils.CompareSign;

public class Condition {
	
	private List<Filter> list = new ArrayList<Filter>();
	
	public Condition addFilter(String leftOperand , Object rightOperand){
		this.addFilter(leftOperand, CompareSign.COND_EQUAL, rightOperand);
		return this;
	}
	
	public Condition addFilter(String leftOperand, String compare, Object rightOperand){
		Filter filter = new Filter(leftOperand , compare , rightOperand);
		list.add(filter);
		return this;
	}
	
	public String getConditionString(){
		if (list.size() <= 0)
			return null;
		
		StringBuilder sb = new StringBuilder();
		sb.append(" WHERE ");
		for (Filter filter : list) {
			sb.append(filter.getLeftOperand() + " ");
			sb.append(filter.getCompare() + " ");
			sb.append(filter.getRightOperand() + " ");
		}
		return sb.toString();
	}
	
	
	private class Filter{
		private String leftOperand;
		private String compare;
		private Object rightOperand;
		
		public Filter(String leftOperand ,String compare ,Object rightOperand){
			this.leftOperand = leftOperand;
			this.compare = compare;
			this.rightOperand = rightOperand;
		}

		public String getLeftOperand() {
			return leftOperand;
		}

		public void setLeftOperand(String leftOperand) {
			this.leftOperand = leftOperand;
		}

		public String getCompare() {
			return compare;
		}
		public Condition addFilter(String leftOption,Object rightOption){
			return addFilter(leftOption,"=",rightOption);
		}
		
		public Condition addFilter(String leftOption,String compare,Object rightOption){
			return null;
		}
		public void setCompare(String compare) {
			this.compare = compare;
		}

		public Object getRightOperand() {
			return rightOperand;
		}

		public void setRightOperand(Object rightOperand) {
			this.rightOperand = rightOperand;
		}
	}
}


