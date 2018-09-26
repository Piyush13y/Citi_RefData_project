package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.beans.Accrued;
import com.beans.Security;
import com.beans.Trade;
import com.connections.DatabaseConnection;
import com.daos.TradeDAO;

public class TradeDAOImpl implements TradeDAO {

	@Override
	public int addTrade(Trade trade) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		
		String ADDTRADE="INSERT INTO TRADES VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		//String ADDTRADE2="SELECT * FROM TRADES,ACCRUEDS,SECURITIES WHERE TRADES.TRADEID=ACCRUEDS.TRADEID AND TRADES.SECID=SECURITIES.SECID";
		
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDTRADE);
			ps.setDate(1, trade.getTradeDate());
			ps.setTime(2, trade.getTradeTime());
			ps.setString(3, trade.getTradeType());
			ps.setString(4, trade.getTradePrice());
			ps.setString(5, trade.getCounterparty());
			ps.setDate(6, trade.getSettlementDate());
			ps.setDate(7, trade.getLastCouponDate());
			ps.setFloat(8, trade.getTicks());
			ps.setFloat(9,trade.getDirtyPrice());
			ps.setFloat(10, trade.getCleanPrice());
			ps.setFloat(11, trade.getSecDetails().getSecId());
			ps.setFloat(12, trade.getUserDetails().getId());
						
			rowsAdded=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO Handle exceptions properly
			e.printStackTrace();
		}
		return rowsAdded;
	}

//	@Override
//	public Trade findTradeByTradeId(int tradeId) {
//		// TODO Auto-generated method stub
//		Trade trade=null;
//		String FIND_BY_TradeId="SELECT * FROM TRADES WHERE TRADEID=?";
//		try(Connection con=DatabaseConnection.openConnection();)
//		{
//			PreparedStatement ps=con.prepareStatement(FIND_BY_TradeId);
//			ps.setInt(1, tradeId);
//			ResultSet set=ps.executeQuery();
//			
//			while(set.next())
//			{
//				String ISIN1=set.getString(10);
//				int secid=set.getInt(1);
//				String secname=set.getString(2);
//				String issuername=set.getString(3);
//				Float facevalue=set.getFloat(4);
//				Float couponrate=set.getFloat(5);
//				int frequency=set.getInt(6);
//				Date matdate=set.getDate(7);
//				int dcc=set.getInt(8);
//				String coupondates=set.getString(9);
//				security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, coupondates, ISIN1);
//				
//				
//			}
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		return security;
//		return null;
//	}

	@Override
	public Trade findTradeByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTrade(int tradeid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Trade> findAllTradesByISIN(String ISINh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trade findTradeByTradeId(int tradeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
