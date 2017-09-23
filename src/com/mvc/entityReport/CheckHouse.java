/**
 * 
 */
package com.mvc.entityReport;

/**
 * 领班查房效率
 * 
 * @author zjn
 * @date 2017年1月17日
 */
public class CheckHouse {
	private String orderNum;// 序号
	private String staffName;// 员工姓名
	private String staffNo;// 员工编号

	private String checkTime;// 查房总用时
	private String totalTime;// 当班总用时
	

	// whm
	private String sumRoom;// 房间数
	private String checkRoomTime;//平均查房时间
	
	private float efficiency;// 效率


	public String getCheckRoomTime() {
		return checkRoomTime;
	}

	public void setCheckRoomTime(String checkRoomTime) {
		this.checkRoomTime = checkRoomTime;
	}

	public String getSumRoom() {
		return sumRoom;
	}

	public void setSumRoom(String sumRoom) {
		this.sumRoom = sumRoom;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public float getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(float efficiency) {
		this.efficiency = efficiency;
	}

}
