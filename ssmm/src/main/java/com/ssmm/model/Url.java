package com.ssmm.model;

/**
 * Â·¾¶
 * @author Administrator
 *
 */
public class Url {
	private Integer id;
	private String url;
	private Privilege privilege;
	
	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	/** default constructor */
	public Url() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
