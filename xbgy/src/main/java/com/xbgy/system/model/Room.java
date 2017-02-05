package com.xbgy.system.model;

/**
 * ��ý�������
 * 2017.1.26
 * @version 1.0
 * @author Grubby
 */
public class Room {

	private String roomCode;
	private String desc;
	private String building;		//¥��
	private String floor;			//��
	private String house;			//��
	private String roomType;		//���
	private String roomStatus;		//״̬
	
	
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
}
