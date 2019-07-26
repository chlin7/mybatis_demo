package com.chl.entity;

/**
 * @ desc：
 * @ Author     ：chenhl01.
 * @ Date       ：Created in 16:55 2019/6/12
 */
public class Country {

	private Long id;
	private String countryName;
	private String countryCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
