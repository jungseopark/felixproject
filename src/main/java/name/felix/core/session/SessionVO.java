package name.felix.core.session;

import java.io.Serializable;
import java.util.List;

import name.felix.commons.auth.service.MenuVO;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SessionVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String userName;

	private String ipAddress;

	private String staffNo;

	private List<MenuVO> topMenuList;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
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

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public List<MenuVO> getTopMenuList() {
		return topMenuList;
	}

	public void setTopMenuList(List<MenuVO> topMenuList) {
		this.topMenuList = topMenuList;
	}

}
