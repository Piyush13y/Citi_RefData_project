package com.daos;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.beans.Security;
import com.beans.Trade;
import com.beans.User;

public interface TradeDAO {
	int addTrade(Trade trade);
	Trade findTradeByTradeId(int tradeId);
	//int noOfAccruedDays(Date settleDate,Date lastCouponDate);
	//double AccruedInterest(Date settleDate,Date lastCouponDate);
	//marketPrice func
	//double calMarketYield(); //arguments
	// func for dirty and clean price 
	int deleteTrade(int tradeid);
	List<Trade> findTradeByUserId(User user);
	List<Trade> findTradeBySecId(Security sec);
	List<Trade> findAllTrades();
    HashMap<String, Integer> findAllTradesCount();

}
