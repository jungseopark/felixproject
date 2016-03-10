package kr.pe.felixproject.common.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("LogInOutVO")
public class LogInOutVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String searchUserId;

	private String searchUserPassword;

	private String userId;

	private String userName;

	private String staffNo;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

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

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

}
