package com.xbgy.system.model;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

/**
 * ืสิด
 * @author Administrator
 *
 */
public class Privilege {

	private Integer priId;
	private String priName;

	private Collection<ConfigAttribute> roleSet;

	public Collection<ConfigAttribute> getRoleSet() {
		return roleSet;
	}
	public void setRoleSet(Collection<ConfigAttribute> roleSet) {
		this.roleSet = roleSet;
	}
	/** default constructor */
	public Privilege() {
	}
	public Integer getPriId() {
		return priId;
	}
	public void setPriId(Integer priId) {
		this.priId = priId;
	}
	public String getPriName() {
		return priName;
	}
	public void setPriName(String priName) {
		this.priName = priName;
	}
}
