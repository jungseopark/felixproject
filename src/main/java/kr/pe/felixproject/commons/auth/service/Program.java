package kr.pe.felixproject.commons.auth.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("Program")
public class Program implements Serializable {

	private static final long serialVersionUID = 1L;

	private String programId;

	private String name;

	private String description;

	private String url;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
