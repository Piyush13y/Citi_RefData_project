package com.daos;

import java.util.Date;
import java.util.List;

import com.beans.Trade;

public interface TradeDAO {
	int addTrade(Trade trade);
	Trade findTradeByTradeId(int tradeId);
	List<Trade> findAllTradesByISIN(String ISINh);
	Trade findTradeByUserName(String userName);
	//int noOfAccruedDays(Date settleDate,Date lastCouponDate);
	//double AccruedInterest(Date settleDate,Date lastCouponDate);
	//marketPrice func
	//double calMarketYield(); //arguments
	// func for dirty and clean price 
	int deleteTrade(int tradeid);

}
