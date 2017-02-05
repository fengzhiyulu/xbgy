package com.xbgy.system.util;

import java.util.List;

public class Page<T> {

	private Integer pageInex;			//当前页
	private Integer pageSize;			//每页大小
	private Integer totalPage;			//总页数
	private Integer totalSize;			//总数量
	private List<T> list;
	
	public Integer getPageInex() {
		return pageInex;
	}
	public void setPageInex(Integer pageInex) {
		this.pageInex = pageInex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
