package com.daos;

import java.util.Date;
import java.util.List;

import com.beans.Trade;

public interface TradeDAO {
	int addTrade(Trade trade);
	Trade findTradeByTradeId(int tradeId);
	List<Trade> findAllTradesByISIN(String ISINh);
	Trade findTradeByUserName(String userName);
	
	int deleteTrade(int tradeid);

}
