package com.algo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.beans.Trade;

public interface DynamicDataCal {
	
	public void initializeTrade(Trade trade);
	public java.sql.Date dateDaysAfter(java.sql.Date todaysDate, Integer days);
	public Integer couponsLeft(Date settlementDate, Date maturityDate, ArrayList<Date> couponDates);
	public Double accruedDays(Date settlementDate, Date lastCouponDate);
	public Date lastCouponDate(Date lastCouponDate, ArrayList<Date> couponDates);
	public Double accruedInterest(Double accruedDays, Double faceValue, Double couponRate);
	// TODO: Marketprice can be fraction as well so create a new data type called fraction
	public Double yield(Double couponRate, Double faceValue, Double marketPrice, Integer frequency, Double accruedDays, Integer numCoupons);
	public Double presentValue(Double couponRate, Double faceValue, Double marketYield, Integer frequency, Double accruedDays, Integer numCoupons);
}