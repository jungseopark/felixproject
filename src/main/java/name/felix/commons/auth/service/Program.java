package name.felix.commons.auth.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("Program")
public class Program implements Serializable {

	private static final long serialVersionUID = 1L;

	private String programId;

	private String programName;

	private String description;

	private String programUrl;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramUrl() {
		return programUrl;
	}

	public void setProgramUrl(String programUrl) {
		this.programUrl = programUrl;
	}

}
