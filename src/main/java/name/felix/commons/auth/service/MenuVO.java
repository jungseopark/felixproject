package name.felix.commons.auth.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("MenuVO")
public class MenuVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String searchUserId;

	private String searchUpperMenuId;

	private String menuId;

	private Menu menuInfo;

	private Program programInfo;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getSearchUserId() {
		return searchUserId;
	}

	public void setSearchUserId(String searchUserId) {
		this.searchUserId = searchUserId;
	}

	public Menu getMenuInfo() {
		return menuInfo;
	}

	public void setMenuInfo(Menu menuInfo) {
		this.menuInfo = menuInfo;
	}

	public Program getProgramInfo() {
		return programInfo;
	}

	public void setProgramInfo(Program programInfo) {
		this.programInfo = programInfo;
	}

	public String getSearchUpperMenuId() {
		return searchUpperMenuId;
	}

	public void setSearchUpperMenuId(String searchUpperMenuId) {
		this.searchUpperMenuId = searchUpperMenuId;
	}

}
