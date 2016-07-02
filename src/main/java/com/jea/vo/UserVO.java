package com.jea.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable{
	
	private static final long serialVersionUID = 2780781216094543527L;

	private Long userId;

    private String userName;

    private String userPassword;
    
    private Date createTime;
    
    private String userInfocol;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUserInfocol() {
		return userInfocol;
	}

	public void setUserInfocol(String userInfocol) {
		this.userInfocol = userInfocol;
	}

}
