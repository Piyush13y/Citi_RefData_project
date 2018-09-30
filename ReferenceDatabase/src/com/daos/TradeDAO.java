package com.daos;

import java.util.Date;
import java.util.List;

import com.beans.Trade;

public interface TradeDAO {
	int addTrade(Trade trade);
	Trade findTradeByTradeId(int tradeId);
	List<Trade> findAllTradesBySecurityId(int secId);
	List<Trade> findTradeByUser(int userId);
	
	int deleteTrade(int tradeid);
	

}
