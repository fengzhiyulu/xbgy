package com.xbgy.system.model;

/**
 * Â·¾¶
 * @author Administrator
 *
 */
public class Url {
	private Integer urlId;
	private String urlName;
	private Privilege privilege;
	
	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public Integer getUrlId() {
		return urlId;
	}

	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
}
