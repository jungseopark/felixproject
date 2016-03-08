package kr.pe.felixproject.common.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProgramVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String searchName;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}
