package com.xbgy.shop.model;

/**
 * ��ݵ��ͻ���Ϣ
 * @author Administrator
 *
 */
public class XShopCustom extends BaseObject{
	
	private String customId;			//�ͻ����
	private String customName;			//�ͻ�����
	private String companyCode;			//��˾
	private String companyName;
	private String telephone;
	private String landline;			//�����绰
	public String getCustomId() {
		return customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
}
