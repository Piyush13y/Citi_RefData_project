package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.beans.Security;
import com.connections.DatabaseConnection;
import com.daos.SecurityDAO;

public class SecurityDAOImpl implements SecurityDAO {
	
	public String dateArrayToString(ArrayList<Date> dateList) {
		StringBuilder dates = new StringBuilder();
		for(Date date: dateList) {
			dates.append(date.toString()+" ");
		}
		String retDates = dates.toString().trim();
		return retDates;
	}
	
	public ArrayList<Date> stringToDateArray(String dates) {
		String[] datesString = dates.split(" ");
		ArrayList<Date> retDates = new ArrayList<Date>();
		for(String str: datesString) {
			try {
				Date date = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
				retDates.add(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return retDates;
	}

	@Override
	public int addSecurity(Security security) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		String ADDSECURITY="INSERT INTO SECURITIES VALUES(?,?,?,?,?,?,?,?,?,?)";
		System.err.println("hererere");
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDSECURITY);
			// ps.setInt(1, security.getSecId());
			ps.setString(1, security.getSecurityName());
			ps.setString(2, security.getIssuerName());
			ps.setDouble(3, security.getFaceValue());
			ps.setDouble(4, security.getCouponRate());
			ps.setInt(5, security.getFrequency());
			ps.setDate(6, security.getMaturityDate());
			ps.setInt(7, security.getDayCountConvention());
			ps.setDouble(8, security.getTickSize());
			// TODO: Convert back to ArrayList everywhere where you're fetching
			// ps.setString(9, "2000-13-12");
			ps.setString(9, dateArrayToString(security.getCouponDates()));
			System.out.println(dateArrayToString(security.getCouponDates()));
			ps.setString(10, security.getiSIN());
			
			rowsAdded=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO Handle exceptions properly
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public Security findSecuritybyISIN(String ISIN) {
		// TODO Auto-generated method stub
		Security security=null;
		String FIND_BY_ISIN="SELECT * FROM SECURITIES WHERE ISIN=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_ISIN);
			ps.setString(1, ISIN);
			ResultSet set=ps.executeQuery();
			
			while(set.next())
			{
				Integer secid=set.getInt(1);
				String secname=set.getString(2);
				String issuername=set.getString(3);
				Double facevalue=set.getDouble(4);
				Double couponrate=set.getDouble(5);
				Integer frequency=set.getInt(6);
				Date matdate=set.getDate(7);
				Integer dcc=set.getInt(8);
				Double tickSize = set.getDouble(9);
				ArrayList<Date> coupondates=stringToDateArray(set.getString(10));
				String ISIN1=set.getString(11);
				security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, tickSize, coupondates, ISIN1);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return security;

		
	}
	
	@Override
	public Security findSecuritybySecurityId(int securityId) {
		// TODO Auto-generated method stub
		Security security=null;
		String FIND_BY_ISIN="SELECT * FROM SECURITIES WHERE SECID=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_ISIN);
			ps.setInt(1, securityId);
			ResultSet set=ps.executeQuery();
			
			while(set.next())
			{
				Integer secid=set.getInt(1);
				String secname=set.getString(2);
				String issuername=set.getString(3);
				Double facevalue=set.getDouble(4);
				Double couponrate=set.getDouble(5);
				Integer frequency=set.getInt(6);
				Date matdate=set.getDate(7);
				Integer dcc=set.getInt(8);
				Double tickSize = set.getDouble(9);
				ArrayList<Date> coupondates=stringToDateArray(set.getString(10));
				String ISIN1=set.getString(11);
				security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, tickSize, coupondates, ISIN1);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return security;

		
	}

	@Override
	public int deleteSecurity(String ISIN) {
		// TODO Auto-generated method stub
		int rowsModified=0;
		String REMOVE_SECURITY="DELETE FROM SECURITIES WHERE ISIN=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(REMOVE_SECURITY);
			ps.setString(1, ISIN);
			rowsModified = ps.executeUpdate();			
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowsModified;
	}

	@Override
	public List<Security> findAllSecurities() {
		// TODO Auto-generated method stub
		List<Security> secList = new ArrayList<Security>();
		Security sec;
		//System.out.println(secList);
		String FIND_ALL="SELECT * FROM SECURITIES";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_ALL);
			ResultSet set=ps.executeQuery();
			
			while(set.next())
			{
				Integer secid=set.getInt(1);
				String secname=set.getString(2);
				String issuername=set.getString(3);
				Double facevalue=set.getDouble(4);
				Double couponrate=set.getDouble(5);
				Integer frequency=set.getInt(6);
				Date matdate=set.getDate(7);
				Integer dcc=set.getInt(8);
				Double tickSize = set.getDouble(9);
				ArrayList<Date> coupondates=stringToDateArray(set.getString(10));
				String ISIN1=set.getString(11);
				sec =new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, tickSize, coupondates, ISIN1);
				secList.add(sec);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return secList;
	}

}
