package kr.pe.felixproject.core.service;

import java.io.Serializable;

public class SessionVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String userName;

	private String ipAddress;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
