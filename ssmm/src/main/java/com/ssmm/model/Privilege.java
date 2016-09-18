package com.ssmm.model;

import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;

/**
 * ืสิด
 * @author Administrator
 *
 */
public class Privilege {

	private Integer id;
	private String name;

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
	/** full constructor */
	public Privilege(String name) {
		this.name = name;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
