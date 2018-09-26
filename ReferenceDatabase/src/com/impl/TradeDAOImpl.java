package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.beans.Accrued;
import com.beans.Security;
import com.beans.Trade;
import com.beans.User;
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
			//ps.setInt(3, trade.getSecDetails().getSecId());
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

			System.out.println(trade.getSecDetails().getSecId());
			
			rowsAdded=ps.executeUpdate();
		} catch(SQLException sq) {
			sq.printStackTrace();
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO Handle exceptions properly
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public Trade findTradeByTradeId(int tradeId) {
		// TODO Auto-generated method stub
		Trade trade=null;
		String FIND_BY_TradeId="SELECT * FROM TRADES WHERE TRADEID=?";
		String FIND_BY_TradeId_Acc = "SELECT * FROM ACCRUEDS WHERE TRADEID=?";
		String FIND_BY_TradeId_Users = "SELECT * FROM USERS WHERE USERID=?";
		String FIND_BY_TradeId_Sec = "SELECT * FROM SECURITIES WHERE SECID=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_TradeId);
			ps.setInt(1, tradeId);
			ResultSet set=ps.executeQuery();
			
			PreparedStatement ps1=con.prepareStatement(FIND_BY_TradeId_Acc);
			ps1.setInt(1, tradeId);
			ResultSet set1=ps1.executeQuery();
			
			PreparedStatement ps2=con.prepareStatement(FIND_BY_TradeId_Users);
			PreparedStatement ps3=con.prepareStatement(FIND_BY_TradeId_Sec);
			
			
			while(set.next())
			{
			
			int tradeId1 = set.getInt(1);
			Date tradeDate = set.getDate(2);
			Time tradeTime = set.getTime(3);
			
			String tradeType = set.getString(4);
			String tradePrice = set.getString(5);
			String counterparty  = set.getString(6);
			Date settlDate = set.getDate(7);
			Date lastCouDate = set.getDate(8);
			float ticks = set.getFloat(9);
			float dirtyPrice = set.getFloat(10);
			float cleanPrice = set.getFloat(11);
			int secId = set.getInt(12);
			int userid = set.getInt(13);
			ps2.setInt(1, userid);
			ResultSet set2=ps2.executeQuery();
			set1.next();
			set2.next();
			List<Accrued> acc = new LinkedList<>();
			acc.add(new Accrued(set1.getInt(1),set1.getFloat(2),set1.getString(3),set1.getFloat(4)));
			User userDetails = new User(set2.getInt(1),set2.getString(2),set2.getString(3));
			
			ps3.setInt(1, secId);
			ResultSet set3=ps3.executeQuery();
			set3.next();
			Security secDetails = new Security(set3.getInt(1), set3.getString(2), set3.getString(3), 
					set3.getFloat(4), set3.getFloat(5), set3.getInt(6), set3.getDate(7), set3.getInt(8), set3.getString(9), set3.getString(10));
			trade = new Trade(tradeId1, tradeDate, tradeTime, tradeType, tradePrice, counterparty, settlDate, acc, lastCouDate, ticks, 
					dirtyPrice, cleanPrice, secDetails, userDetails);
			}
			//ResultSet set=ps.executeQuery();
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
//				Security security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, coupondates, ISIN1);
//				
				
			//}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return trade;
		
	}

	
	@Override
	public int deleteTrade(int tradeid) {
		// TODO Auto-generated method stub
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
			rowsModified += ps1.executeUpdate();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowsModified;
		
	}

	@Override
	public List<Trade> findAllTradesByISIN(String ISINh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	List<Trade> findTradeByUserId(User user) {
		// TODO Auto-generated method stub
		Trade trade=null;
		List<Trade> list = new ArrayList<>();
		String FIND_BY_User="SELECT * FROM TRADES WHERE USERID=?";
//		String FIND_BY_UserID_Acc = "SELECT * FROM ACCRUEDS WHERE TRADEID=?";
//		String FIND_BY_UserId_Users = "SELECT * FROM USERS WHERE USERID=?";
    	String FIND_BY_UserId_Sec = "SELECT * FROM SECURITIES WHERE SECID=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_User);
			ps.setInt(1, user.getId());
			ResultSet set=ps.executeQuery();
			
//			PreparedStatement ps1=con.prepareStatement(FIND_BY_UserID_Acc);
			//ps1.setInt(1, );
//			ResultSet set1=ps1.executeQuery();
			
//			PreparedStatement ps2=con.prepareStatement(FIND_BY_UserId_Users);
		    
			
			
			while(set.next())
			{
			
			int tradeId1 = set.getInt(1);
			Date tradeDate = set.getDate(2);
			Time tradeTime = set.getTime(3);
			
			String tradeType = set.getString(4);
			String tradePrice = set.getString(5);
			String counterparty  = set.getString(6);
			Date settlDate = set.getDate(7);
			Date lastCouDate = set.getDate(8);
			float ticks = set.getFloat(9);
			float dirtyPrice = set.getFloat(10);
			float cleanPrice = set.getFloat(11);
			int secId = set.getInt(12);
			int userid = set.getInt(13);
//			ps2.setInt(1, userid);
//			ResultSet set2=ps2.executeQuery();
//		set1.next();
//			set2.next();
//			List<Accrued> acc = new LinkedList<>();
//			acc.add(new Accrued(set1.getInt(1),set1.getFloat(2),set1.getString(3),set1.getFloat(4)));
//			User userDetails = new User(set2.getInt(1),set2.getString(2),set2.getString(3));
			PreparedStatement ps3=con.prepareStatement(FIND_BY_UserId_Sec);			
			ps3.setInt(1, secId);
			ResultSet set3=ps3.executeQuery();
			set3.next();
			Security secDetails = new Security(set3.getInt(1), set3.getString(2), set3.getString(3), 
					set3.getFloat(4), set3.getFloat(5), set3.getInt(6), set3.getDate(7), set3.getInt(8), set3.getString(9), set3.getString(10));
		trade = new Trade(tradeId1, tradeDate, tradeTime, tradeType, tradePrice, counterparty, settlDate, null, lastCouDate, ticks, 
				dirtyPrice, cleanPrice, secDetails, user);
		list.add(trade);
			}
			//ResultSet set=ps.executeQuery();
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
//				Security security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, coupondates, ISIN1);
//				
				
			//}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	@Override
	public
	List<Trade> findTradeBySecId(Security security) {
		List<Trade> list = new ArrayList<>();
		String FIND_BY_USER="SELECT * FROM TRADES WHERE SECID=?";
    	String FIND_BY_UserId_Sec = "SELECT * FROM SECURITIES WHERE SECID=?";
    	
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_USER);
			ps.setInt(1, user.getId());
			ResultSet set=ps.executeQuery();

			while(set.next())
			{
			
			int tradeId1 = set.getInt(1);
			Date tradeDate = set.getDate(2);
			Time tradeTime = set.getTime(3);
			
			String tradeType = set.getString(4);
			String tradePrice = set.getString(5);
			String counterparty  = set.getString(6);
			Date settlDate = set.getDate(7);
			Date lastCouDate = set.getDate(8);
			float ticks = set.getFloat(9);
			float dirtyPrice = set.getFloat(10);
			float cleanPrice = set.getFloat(11);
			int secId = set.getInt(12);
			int userid = set.getInt(13);
			PreparedStatement ps3=con.prepareStatement(FIND_BY_UserId_Sec);			
			ps3.setInt(1, secId);
			ResultSet set3=ps3.executeQuery();
			set3.next();
			Security secDetails = new Security(set3.getInt(1), set3.getString(2), set3.getString(3), 
					set3.getFloat(4), set3.getFloat(5), set3.getInt(6), set3.getDate(7), set3.getInt(8), set3.getString(9), set3.getString(10));
		trade = new Trade(tradeId1, tradeDate, tradeTime, tradeType, tradePrice, counterparty, settlDate, null, lastCouDate, ticks, 
				dirtyPrice, cleanPrice, secDetails, user);
		list.add(trade);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}

}
