package com.ssmm.model;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.GrantedAuthority;

/**
 * ½ÇÉ«
 * @author Administrator
 *
 */
public class Role implements GrantedAuthority,ConfigAttribute{
	
	private Integer roleId;
	private String roleName;
	private String roleDesc;

	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	@Override
	public String getAuthority() {	//User
		return roleName;
	}
	@Override
	public String getAttribute() {	//Privilege
		return roleName;
	}
}
