package name.felix.commons.log.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("WebLogVO")
public class WebLogVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String logSeq;

	private String url;

	private String staffNo;

	private String ipAddress;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getLogSeq() {
		return logSeq;
	}

	public void setLogSeq(String logSeq) {
		this.logSeq = logSeq;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
