package com.beans;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Trade {
	private Integer tradeId;
	private Date tradeDate;
	private Time tradeTime;
	private String tradeType;
	// TODO: Price can be fraction as well and it's not the same as decimal
	// TODO: See if marketPrice can be kept as a calculatable data type
	private Double marketPrice;
	private Double marketYield;
	private Double tradePrice;
	private Double tradeYield;
	private String counterParty;
	private Date settlementDate;
	
	private List<Accrued> accrued;
	private Date lastCouponDate;
	private Double ticks;
	private Double dirtyPrice;
	private Double cleanPrice;
	private Security secDetails;
	private User userDetails;
	
	public Trade(Integer tradeId, Date tradeDate, Time tradeTime, String tradeType, Double marketPrice,
			Double marketYield, Double tradePrice, Double tradeYield, String counterParty, Date settlementDate,
			List<Accrued> accrued, Date lastCouponDate, Double ticks, Double dirtyPrice, Double cleanPrice,
			Security secDetails, User userDetails) {
		super();
		this.tradeId = tradeId;
		this.tradeDate = tradeDate;
		this.tradeTime = tradeTime;
		this.tradeType = tradeType;
		this.marketPrice = marketPrice;
		this.marketYield = marketYield;
		this.tradePrice = tradePrice;
		this.tradeYield = tradeYield;
		this.counterParty = counterParty;
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

	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Double getMarketYield() {
		return marketYield;
	}

	public void setMarketYield(Double marketYield) {
		this.marketYield = marketYield;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getTradeYield() {
		return tradeYield;
	}

	public void setTradeYield(Double tradeYield) {
		this.tradeYield = tradeYield;
	}

	public String getCounterParty() {
		return counterParty;
	}

	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
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

	public Double getTicks() {
		return ticks;
	}

	public void setTicks(Double ticks) {
		this.ticks = ticks;
	}

	public Double getDirtyPrice() {
		return dirtyPrice;
	}

	public void setDirtyPrice(Double dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
	}

	public Double getCleanPrice() {
		return cleanPrice;
	}

	public void setCleanPrice(Double cleanPrice) {
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
				+ tradeType + ", marketPrice=" + marketPrice + ", marketYield=" + marketYield + ", tradePrice="
				+ tradePrice + ", tradeYield=" + tradeYield + ", counterParty=" + counterParty + ", settlementDate="
				+ settlementDate + ", accrued=" + accrued + ", lastCouponDate=" + lastCouponDate + ", ticks=" + ticks
				+ ", dirtyPrice=" + dirtyPrice + ", cleanPrice=" + cleanPrice + ", secDetails=" + secDetails
				+ ", userDetails=" + userDetails + "]";
	}
}
