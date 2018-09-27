package com.beans;

import java.util.List;

public class Accrued {
	private Integer AccruedDays;
	private Float AccruedInterest;
	private String MarketPrice;
	private Float MarketYield;
	
	public Accrued() {
		super();
	}


	
	public Accrued(int accruedDays, float accruedInterest, String marketPrice, float marketYield) {
		super();
		AccruedDays = accruedDays;
		AccruedInterest = accruedInterest;
		MarketPrice = marketPrice;
		MarketYield = marketYield;
	}



	public int getAccruedDays() {
		return AccruedDays;
	}


	public void setAccruedDays(int accruedDays) {
		AccruedDays = accruedDays;
	}


	public float getAccruedInterest() {
		return AccruedInterest;
	}


	public void setAccruedInterest(float accruedInterest) {
		AccruedInterest = accruedInterest;
	}


	public String getMarketPrice() {
		return MarketPrice;
	}


	public void setMarketPrice(String marketPrice) {
		MarketPrice = marketPrice;
	}


	public float getMarketYield() {
		return MarketYield;
	}


	public void setMarketYield(float marketYield) {
		MarketYield = marketYield;
	}
	
	
	
	

}
