package com.beans;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

public class Trade {
	private Integer TradeId;
	private Date TradeDate;
	private Time TradeTime;
	private String TradeType;
	// TODO: Price can be fraction as well and it's not the same as decimal
	private String TradePrice;
	private String Counterparty;
	private Date SettlementDate;
	
	private List<Accrued> accrued ;
	
	private Date LastCouponDate;
	private float Ticks;
	private float DirtyPrice;
	private float CleanPrice;
	private Security SecDetails;
	private User UserDetails;
	
	public Trade() {
		TradeId=12;
		TradeDate=new Date(2018,9,26);
		TradeTime=new Time(3,34,45);
		TradeType ="reli";
		TradeType="buy";
		TradePrice="100-12";
		Counterparty="coun";
		SettlementDate=new Date(2018, 12, 26);
		this.accrued = new LinkedList<>();
		new Date(2018, 12,26),
//		34.76f,56.65f,45.34f,sec,user
	}

	public Trade(Integer tradeId, Date tradeDate, Time tradeTime, String tradeType, String tradePrice,
			String counterparty, Date settlementDate, List<Accrued> accrued, Date lastCouponDate, float ticks,
			float dirtyPrice, float cleanPrice, Security secDetails, User userDetails) {
		super();
		TradeId = tradeId;
		TradeDate = tradeDate;
		TradeTime = tradeTime;
		TradeType = tradeType;
		TradePrice = tradePrice;
		Counterparty = counterparty;
		SettlementDate = settlementDate;
		this.accrued = accrued;
		LastCouponDate = lastCouponDate;
		Ticks = ticks;
		DirtyPrice = dirtyPrice;
		CleanPrice = cleanPrice;
		SecDetails = secDetails;
		UserDetails = userDetails;
	}

	

	public User getUserDetails() {
		return UserDetails;
	}

	public void setUserDetails(User userDetails) {
		UserDetails = userDetails;
	}
	
	public Security getSecDetails() {
		return SecDetails;
	}
	public void setSecDetails(Security secDetails) {
		SecDetails = secDetails;
	}
	public void setTradeId(Integer tradeId) {
		TradeId = tradeId;
	}
	public int getTradeId() {
		return TradeId;
	}
	public void setTradeId(int tradeId) {
		TradeId = tradeId;
	}
	public Date getTradeDate() {
		return TradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		TradeDate = tradeDate;
	}
	public Time getTradeTime() {
		return TradeTime;
	}
	public void setTradeTime(Time tradeTime) {
		TradeTime = tradeTime;
	}
	public String getTradeType() {
		return TradeType;
	}
	public void setTradeType(String tradeType) {
		TradeType = tradeType;
	}
	public String getTradePrice() {
		return TradePrice;
	}
	public void setTradePrice(String tradePrice) {
		TradePrice = tradePrice;
	}
	public String getCounterparty() {
		return Counterparty;
	}
	public void setCounterparty(String counterparty) {
		Counterparty = counterparty;
	}
	public Date getSettlementDate() {
		return SettlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		SettlementDate = settlementDate;
	}
	public List<Accrued> getAccrued() {
		return accrued;
	}
	public void setAccrued(List<Accrued> accrued) {
		this.accrued = accrued;
	}
	public Date getLastCouponDate() {
		return LastCouponDate;
	}
	public void setLastCouponDate(Date lastCouponDate) {
		LastCouponDate = lastCouponDate;
	}
	public float getTicks() {
		return Ticks;
	}
	public void setTicks(float ticks) {
		Ticks = ticks;
	}
	public float getDirtyPrice() {
		return DirtyPrice;
	}
	public void setDirtyPrice(float dirtyPrice) {
		DirtyPrice = dirtyPrice;
	}
	public float getCleanPrice() {
		return CleanPrice;
	}
	public void setCleanPrice(float cleanPrice) {
		CleanPrice = cleanPrice;
	}

}
