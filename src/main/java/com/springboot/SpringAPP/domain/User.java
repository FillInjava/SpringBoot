package com.springboot.SpringAPP.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	private String usercode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String uuid) {
		this.usercode = uuid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
