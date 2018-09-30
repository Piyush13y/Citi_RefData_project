package com.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Security implements Serializable{
	private Integer secId;
	private String securityName;
	private String issuerName;
	private Double faceValue;
	private Double couponRate;
	private Integer frequency;
	private Date maturityDate;
	private Integer dayCountConvention;
	private Double tickSize;
	ArrayList<Date> couponDates;
	private String iSIN;
	
	public Security(Integer secId, String securityName, String issuerName, Double faceValue, Double couponRate,
			Integer frequency, Date maturityDate, Integer dayCountConvention, Double tickSize,
			ArrayList<Date> couponDates, String iSIN) {
		super();
		this.secId = secId;
		this.securityName = securityName;
		this.issuerName = issuerName;
		this.faceValue = faceValue;
		this.couponRate = couponRate;
		this.frequency = frequency;
		this.maturityDate = maturityDate;
		this.dayCountConvention = dayCountConvention;
		this.tickSize = tickSize;
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
	public Double getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(Double faceValue) {
		this.faceValue = faceValue;
	}
	public Double getCouponRate() {
		return couponRate;
	}
	public void setCouponRate(Double couponRate) {
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
	public Double getTickSize() {
		return tickSize;
	}
	public void setTickSize(Double tickSize) {
		this.tickSize = tickSize;
	}
	public ArrayList<Date> getCouponDates() {
		return couponDates;
	}
	public void setCouponDates(ArrayList<Date> couponDates) {
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
				+ ", maturityDate=" + maturityDate + ", dayCountConvention=" + dayCountConvention + ", tickSize="
				+ tickSize + ", couponDates=" + couponDates + ", iSIN=" + iSIN + "]";
	}
}
