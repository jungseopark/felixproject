package name.felix.commons.auth.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("UserRole")
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String roleId;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
