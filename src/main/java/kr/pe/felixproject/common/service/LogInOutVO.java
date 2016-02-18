package kr.pe.felixproject.common.service;

import java.io.Serializable;

public class LogInOutVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String searchUserId;

	private String searchUserPassword;

	private String userId;

	private String userName;

	public String getSearchUserId() {
		return searchUserId;
	}

	public void setSearchUserId(String searchUserId) {
		this.searchUserId = searchUserId;
	}

	public String getSearchUserPassword() {
		return searchUserPassword;
	}

	public void setSearchUserPassword(String searchUserPassword) {
		this.searchUserPassword = searchUserPassword;
	}

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

}
