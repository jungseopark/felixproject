package name.felix.commons.code.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

@Alias("NationCode")
public class NationCode implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nationCode;

	private String nationNameKorea;

	private String nationNameEnglish;

	private String continentCode;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public String getNationNameKorea() {
		return nationNameKorea;
	}

	public void setNationNameKorea(String nationNameKorea) {
		this.nationNameKorea = nationNameKorea;
	}

	public String getNationNameEnglish() {
		return nationNameEnglish;
	}

	public void setNationNameEnglish(String nationNameEnglish) {
		this.nationNameEnglish = nationNameEnglish;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

}
