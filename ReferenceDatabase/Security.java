package com.beans;

import java.sql.Date;

public class Security {
	private Integer secId;
	private String securityName;
	private String issuerName;
	private Float faceValue;
	private Float couponRate;
	private Integer frequency;
	private Date maturityDate;
	private Integer dayCountConvention;
	private String couponDates; // TO DO change it to arraylist
	private String iSIN;
	
	
	
	public Security(Integer secId, String securityName, String issuerName, Float faceValue, Float couponRate,
			Integer frequency, Date maturityDate, Integer dayCountConvention, String couponDates, String iSIN) {
		super();
		this.secId = secId;
		this.securityName = securityName;
		this.issuerName = issuerName;
		this.faceValue = faceValue;
		this.couponRate = couponRate;
		this.frequency = frequency;
		this.maturityDate = maturityDate;
		this.dayCountConvention = dayCountConvention;
		this.couponDates = couponDates;
		this.iSIN = iSIN;
	}
	
	public Integer getSecId() {
		return secId;
	}
	public void setSecId(Integer secId) {
		this.secId = secId;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public Float getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(Float faceValue) {
		this.faceValue = faceValue;
	}
	public Float getCouponRate() {
		return couponRate;
	}
	public void setCouponRate(Float couponRate) {
		this.couponRate = couponRate;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public Integer getDayCountConvention() {
		return dayCountConvention;
	}
	public void setDayCountConvention(Integer dayCountConvention) {
		this.dayCountConvention = dayCountConvention;
	}
	public String getCouponDates() {
		return couponDates;
	}
	public void setCouponDates(String couponDates) {
		this.couponDates = couponDates;
	}
	public String getiSIN() {
		return iSIN;
	}
	public void setiSIN(String iSIN) {
		this.iSIN = iSIN;
	}

	@Override
	public String toString() {
		return "Security [secId=" + secId + ", securityName=" + securityName + ", issuerName=" + issuerName
				+ ", faceValue=" + faceValue + ", couponRate=" + couponRate + ", frequency=" + frequency
				+ ", maturityDate=" + maturityDate + ", dayCountConvention=" + dayCountConvention + ", couponDates="
				+ couponDates + ", iSIN=" + iSIN + "]";
	}
	
		

}
