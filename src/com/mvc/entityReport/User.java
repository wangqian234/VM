package com.mvc.entityReport;
/*
 * 用户表
 * zq
 * */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
private Integer user_id;//用户ID
private String user_openId;//用户openId
private Integer user_state;//0表示未关注，1表示关注

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Integer getUser_id() {
	return user_id;
}
public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}
@Column(length = 32)
public String getUser_openId() {
	return user_openId;
}
public void setUser_openId(String user_openId) {
	this.user_openId = user_openId;
}
@Column(columnDefinition = "INT not null default 0")
public Integer getUser_state() {
	return user_state;
}
public void setUser_state(Integer user_state) {
	this.user_state = user_state;
}

}
