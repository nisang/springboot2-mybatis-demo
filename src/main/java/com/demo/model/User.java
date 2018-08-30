package com.demo.model;

import java.io.Serializable;

import lombok.Data;

/**
 * edit by:nisang
 * date:2018.08.30
 *
 */

public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6448039218841534130L;

	private Integer userId;

    private String userName;

    private String password;

    private String phone;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    

}