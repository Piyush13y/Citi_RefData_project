package com.beans;

import java.sql.Date;

public class Security {
	private Integer SecId;
	private String SecurityName;
	private String IssuerName;
	private float FaceValue;
	private float CouponRate;
	private int Frequency;
	private Date MaturityDate;
	private int DayCountConvention;
	private String CouponDates;
	private String ISIN;
	
	public Security(Integer secId, String securityName, String issuerName, float faceValue, float couponRate, int frequency,
			Date maturityDate, int dayCountConvention, String couponDates, String iSIN) {
		super();
		SecId = secId;
		SecurityName = securityName;
		IssuerName = issuerName;
		FaceValue = faceValue;
		CouponRate = couponRate;
		Frequency = frequency;
		MaturityDate = maturityDate;
		DayCountConvention = dayCountConvention;
		CouponDates = couponDates;
		ISIN = iSIN;
	}

	public Integer getSecId() {
		return SecId;
	}

	public void setSecId(Integer secId) {
		SecId = secId;
	}

	public String getSecurityName() {
		return SecurityName;
	}

	public void setSecurityName(String securityName) {
		SecurityName = securityName;
	}

	public String getIssuerName() {
		return IssuerName;
	}

	public void setIssuerName(String issuerName) {
		IssuerName = issuerName;
	}

	public float getFaceValue() {
		return FaceValue;
	}

	public void setFaceValue(float faceValue) {
		FaceValue = faceValue;
	}

	public float getCouponRate() {
		return CouponRate;
	}

	public void setCouponRate(float couponRate) {
		CouponRate = couponRate;
	}

	public int getFrequency() {
		return Frequency;
	}

	public void setFrequency(int frequency) {
		Frequency = frequency;
	}

	public Date getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
	}

	public int getDayCountConvention() {
		return DayCountConvention;
	}

	public void setDayCountConvention(int dayCountConvention) {
		DayCountConvention = dayCountConvention;
	}

	public String getCouponDates() {
		return CouponDates;
	}

	public void setCouponDates(String couponDates) {
		CouponDates = couponDates;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	@Override
	public String toString() {
		return "Security [SecId=" + SecId + ", SecurityName=" + SecurityName + ", IssuerName=" + IssuerName
				+ ", FaceValue=" + FaceValue + ", CouponRate=" + CouponRate + ", Frequency=" + Frequency
				+ ", MaturityDate=" + MaturityDate + ", DayCountConvention=" + DayCountConvention + ", CouponDates="
				+ CouponDates + ", ISIN=" + ISIN + "]";
	}
	
	

}
