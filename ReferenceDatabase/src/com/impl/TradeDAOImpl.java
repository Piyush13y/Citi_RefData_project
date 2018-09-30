package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.beans.Accrued;
import com.beans.Security;
import com.beans.Trade;
import com.beans.User;
import com.connections.DatabaseConnection;
import com.daos.AccruedDAO;
import com.daos.SecurityDAO;
import com.daos.TradeDAO;
import com.daos.UserDAO;

public class TradeDAOImpl implements TradeDAO {

	@Override
	public int addTrade(Trade trade) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		
		String ADDTRADE="INSERT INTO TRADES OUTPUT INSERTED.TRADEID VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//String ADDTRADE2="SELECT * FROM TRADES,ACCRUEDS,SECURITIES WHERE TRADES.TRADEID=ACCRUEDS.TRADEID AND TRADES.SECID=SECURITIES.SECID";
		
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDTRADE);
			ps.setDate(1, trade.getTradeDate());
			ps.setTime(2, trade.getTradeTime());
			ps.setString(3, trade.getTradeType());
			
			ps.setDouble(4, trade.getTradePrice());
			ps.setString(5, trade.getCounterParty());
			ps.setDate(6, trade.getSettlementDate());
			ps.setDate(7, trade.getLastCouponDate());
			// TODO: Remove Ticks from pojo and database table if not required else provide value during initialization
			trade.setTicks(0.0d); ps.setDouble(8, trade.getTicks());
			ps.setDouble(9,trade.getDirtyPrice());
			ps.setDouble(10, trade.getCleanPrice());
			ps.setDouble(11,trade.getMarketPrice());
			ps.setDouble(12, trade.getMarketYield());
			ps.setDouble(13, trade.getTradeYield());
			ps.setInt (14, trade.getSecDetails().getSecId());
			ps.setInt(15, trade.getUserDetails().getId());
						
			ResultSet set = ps.executeQuery();
			if(set.next()) {
				rowsAdded = 1;
				Integer tradeId = set.getInt("tradeid");
				AccruedDAO accruedDAO = new AccruedDAOImpl();
				accruedDAO.addAccrued(trade.getAccrued(), tradeId);
			}
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
	public List<Trade> findTradeByUser(int userId) {
			Trade trade=null;
			List<Trade> list = new ArrayList<>();
			String FIND_BY_User="SELECT * FROM TRADES WHERE USERID=? ORDER BY  TRADE_DATE DESC,TRADE_TIME DESC";
			try(Connection con=DatabaseConnection.openConnection();)
			{
				PreparedStatement ps=con.prepareStatement(FIND_BY_User);
				ps.setInt(1, userId);
				ResultSet set=ps.executeQuery();
				
				
				while(set.next())
				{
				
				int tradeId = set.getInt(1);
				Date tradeDate = set.getDate(2);
				Time tradeTime = set.getTime(3);
				String tradeType = set.getString(4);
				Double tradePrice = set.getDouble(5);
				String counterparty  = set.getString(6);
				Date settlDate = set.getDate(7);
				Date lastCouDate = set.getDate(8);
				Double ticks = set.getDouble(9);
				Double dirtyPrice = set.getDouble(10);
				Double cleanPrice = set.getDouble(11);
				Double marketPrice =set.getDouble(12);
				Double marketYield =set.getDouble(13);
				Double tradeYield = set.getDouble(14);
				int secId = set.getInt(15);
				SecurityDAO secdao = new SecurityDAOImpl();
				Security sec= secdao.findSecuritybySecurityId(secId);
				Integer userid = set.getInt(16);
				UserDAO udao = new UserDAOImpl();
				User u= udao.findUserByuserId(userid);
			
				trade = new Trade(tradeId, tradeDate, tradeTime, tradeType, marketPrice, marketYield, tradePrice, tradeYield, counterparty, settlDate, null, lastCouDate, ticks, dirtyPrice, cleanPrice, sec, u);
				list.add(trade);
				}
				
			} catch(SQLException e)
			{
				e.printStackTrace();
			}
			return list;
			
		}


	@Override
	public int deleteTrade(int tradeid) {
				int rowsModified=0;
				String REMOVE_TRADE="DELETE FROM TRADES WHERE TRADEID=?";
				String REMOVE_ACCRUEDS="DELETE FROM ACCRUEDS WHERE TRADEID=?";
				try(Connection con=DatabaseConnection.openConnection();)
				{
					PreparedStatement ps=con.prepareStatement(REMOVE_ACCRUEDS);
					ps.setInt(1, tradeid);
					rowsModified = ps.executeUpdate();
					
					PreparedStatement ps1=con.prepareStatement(REMOVE_TRADE);
					ps1.setInt(1, tradeid);
					rowsModified =rowsModified+ ps1.executeUpdate();
				} catch(SQLException e)
				{
					e.printStackTrace();
				}
				return rowsModified;
	}

	
	@Override
	public List<Trade> findAllTradesBySecurityId(int secId ) {
		List<Trade> list = new ArrayList<>();
		Trade trade=null;
		String FIND_BY_SECID="SELECT * FROM TRADES WHERE SECID=? ORDER BY  TRADE_DATE DESC,TRADE_TIME DESC ";
    	
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_SECID);
			ps.setInt(1, secId);
			ResultSet set=ps.executeQuery();

			while(set.next())
			{
				int tradeId = set.getInt(1);
				Date tradeDate = set.getDate(2);
				Time tradeTime = set.getTime(3);
				String tradeType = set.getString(4);
				Double tradePrice = set.getDouble(5);
				String counterparty  = set.getString(6);
				Date settlDate = set.getDate(7);
				Date lastCouDate = set.getDate(8);
				Double ticks = set.getDouble(9);
				Double dirtyPrice = set.getDouble(10);
				Double cleanPrice = set.getDouble(11);
				Double marketPrice =set.getDouble(12);
				Double marketYield =set.getDouble(13);
				Double tradeYield = set.getDouble(14);
				secId = set.getInt(15);
				SecurityDAO secdao = new SecurityDAOImpl();
				Security sec= secdao.findSecuritybySecurityId(secId);
				Integer userid = set.getInt(16);
				User u = new User();
				u.setId(userid);
				trade = new Trade(tradeId, tradeDate, tradeTime, tradeType, marketPrice, marketYield, tradePrice, tradeYield, counterparty, settlDate, null, lastCouDate, ticks, dirtyPrice, cleanPrice, sec, u);
			
				list.add(trade);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public Trade findTradeByTradeId(int tradeId) {
		Trade trade=null;
		String FIND_BY_TRADEID="SELECT * FROM TRADES WHERE TRADEID=?";
    	
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_TRADEID);
			ps.setInt(1, tradeId);
			ResultSet set=ps.executeQuery();

			while(set.next())
			{
				tradeId = set.getInt(1);
				Date tradeDate = set.getDate(2);
				Time tradeTime = set.getTime(3);
				String tradeType = set.getString(4);
				Double tradePrice = set.getDouble(5);
				String counterparty  = set.getString(6);
				Date settlDate = set.getDate(7);
				Date lastCouDate = set.getDate(8);
				Double ticks = set.getDouble(9);
				Double dirtyPrice = set.getDouble(10);
				Double cleanPrice = set.getDouble(11);
				Double marketPrice =set.getDouble(12);
				Double marketYield =set.getDouble(13);
				Double tradeYield = set.getDouble(14);
				int secId = set.getInt(15);
				SecurityDAO secdao = new SecurityDAOImpl();
				Security sec= secdao.findSecuritybySecurityId(secId);
				Integer userid = set.getInt(16);
				User u = new User();
				u.setId(userid);
				trade = new Trade(tradeId, tradeDate, tradeTime, tradeType, marketPrice, marketYield, tradePrice, tradeYield, counterparty, settlDate, null, lastCouDate, ticks, dirtyPrice, cleanPrice, sec, u);
			}
			
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return trade;
	}

}
