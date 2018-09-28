package com.beans;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

public class Trade {
	private Integer tradeId;
	private Date tradeDate;
	private Time tradeTime;
	private String tradeType;
	// TODO: Price can be fraction as well and it's not the same as decimal
	private String tradePrice;
	private String counterparty;
	private Date settlementDate;
	
	private List<Accrued> accrued ;
	
	private Date lastCouponDate;
	private Float ticks;
	private Float dirtyPrice;
	private Float cleanPrice;
	private Security secDetails;
	private User userDetails;
	
	public Trade(Integer tradeId, Date tradeDate, Time tradeTime, String tradeType, String tradePrice,
			String counterparty, Date settlementDate, List<Accrued> accrued, Date lastCouponDate, Float ticks,
			Float dirtyPrice, Float cleanPrice, Security secDetails, User userDetails) {
		super();
		this.tradeId = tradeId;
		this.tradeDate = tradeDate;
		this.tradeTime = tradeTime;
		this.tradeType = tradeType;
		this.tradePrice = tradePrice;
		this.counterparty = counterparty;
		this.settlementDate = settlementDate;
		this.accrued = accrued;
		this.lastCouponDate = lastCouponDate;
		this.ticks = ticks;
		this.dirtyPrice = dirtyPrice;
		this.cleanPrice = cleanPrice;
		this.secDetails = secDetails;
		this.userDetails = userDetails;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Time getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Time tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public Date getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	public List<Accrued> getAccrued() {
		return accrued;
	}

	public void setAccrued(List<Accrued> accrued) {
		this.accrued = accrued;
	}

	public Date getLastCouponDate() {
		return lastCouponDate;
	}

	public void setLastCouponDate(Date lastCouponDate) {
		this.lastCouponDate = lastCouponDate;
	}

	public Float getTicks() {
		return ticks;
	}

	public void setTicks(Float ticks) {
		this.ticks = ticks;
	}

	public Float getDirtyPrice() {
		return dirtyPrice;
	}

	public void setDirtyPrice(Float dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
	}

	public Float getCleanPrice() {
		return cleanPrice;
	}

	public void setCleanPrice(Float cleanPrice) {
		this.cleanPrice = cleanPrice;
	}

	public Security getSecDetails() {
		return secDetails;
	}

	public void setSecDetails(Security secDetails) {
		this.secDetails = secDetails;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", tradeDate=" + tradeDate + ", tradeTime=" + tradeTime + ", tradeType="
				+ tradeType + ", tradePrice=" + tradePrice + ", counterparty=" + counterparty + ", settlementDate="
				+ settlementDate + ", accrued=" + accrued + ", lastCouponDate=" + lastCouponDate + ", ticks=" + ticks
				+ ", dirtyPrice=" + dirtyPrice + ", cleanPrice=" + cleanPrice + ", secDetails=" + secDetails
				+ ", userDetails=" + userDetails + "]";
	}

	
}
