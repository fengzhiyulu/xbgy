package com.xbgy.system.model;

/**
 * Â¥¶°
 * @author GRUBBY
 *
 */
public class TSysBuildDef {

	private String buildId;
	private String buildCode;
	private String buildName;
	private String buildDesc;
	private String buildAddr;
	private Integer floorNumber;
	private Integer roomNumber;
	private String createTime;
	private String updateTime;

	public String getBuildId() {
		return buildId;
	}
	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}
	public String getBuildCode() {
		return buildCode;
	}
	public void setBuildCode(String buildCode) {
		this.buildCode = buildCode;
	}
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public String getBuildDesc() {
		return buildDesc;
	}
	public void setBuildDesc(String buildDesc) {
		this.buildDesc = buildDesc;
	}
	public String getBuildAddr() {
		return buildAddr;
	}
	public void setBuildAddr(String buildAddr) {
		this.buildAddr = buildAddr;
	}
	public Integer getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
