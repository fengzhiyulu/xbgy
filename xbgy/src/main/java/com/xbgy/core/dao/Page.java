package com.xbgy.core.dao;

import java.util.ArrayList;
import java.util.List;

public class Page <T>{
	
	private Integer pageIndex = 1;
	private Integer pageSize = 20;
	private Integer TotalSize;
	private Integer lastPage;
	private Integer prePage;
	private Integer postPage;
	
	private List<T> list;
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalSize() {
		return TotalSize;
	}
	public void setTotalSize(Integer totalSize) {
		TotalSize = totalSize;
	}
	public Integer getPrePage() {
		return getPageIndex()-1 >= 1 ? getPageIndex()-1 : 1;
	}
	public Integer getPostPage() {
		return getPageIndex()+1 >= 1 ? getPageIndex()+1 : 1;
	}
	public Integer getLastPage() {
		return getTotalSize()/getPageSize()+ 1;
	}
	public List<T> getList() {
		if(list == null)
			list = new ArrayList<T>();
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
