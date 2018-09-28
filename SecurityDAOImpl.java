package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Security;
import com.connections.DatabaseConnection;
import com.daos.SecurityDAO;

public class SecurityDAOImpl implements SecurityDAO {

	@Override
	public int addSecurity(Security security) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		String ADDSECURITY="INSERT INTO SECURITIES VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDSECURITY);
			ps.setInt(1, security.getSecId());
			ps.setString(2, security.getSecurityName());
			ps.setString(3, security.getIssuerName());
			ps.setFloat(4, security.getFaceValue());
			ps.setFloat(5, security.getCouponRate());
			ps.setInt(6, security.getFrequency());
			ps.setDate(7, security.getMaturityDate());
			ps.setInt(8, security.getDayCountConvention());
			ps.setString(9, security.getCouponDates());
			ps.setString(10, security.getISIN());
			
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
				String ISIN1=set.getString(10);
				int secid=set.getInt(1);
				String secname=set.getString(2);
				String issuername=set.getString(3);
				Float facevalue=set.getFloat(4);
				Float couponrate=set.getFloat(5);
				int frequency=set.getInt(6);
				Date matdate=set.getDate(7);
				int dcc=set.getInt(8);
				String coupondates=set.getString(9);
				security=new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, coupondates, ISIN1);
				
				
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
		System.out.println(secList);
		String FIND_ALL="SELECT * FROM SECURITIES";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_ALL);
			ResultSet set=ps.executeQuery();
			
			while(set.next())
			{
				String ISIN1=set.getString(10);
				int secid=set.getInt(1);
				String secname=set.getString(2);
				String issuername=set.getString(3);
				Float facevalue=set.getFloat(4);
				Float couponrate=set.getFloat(5);
				int frequency=set.getInt(6);
				Date matdate=set.getDate(7);
				int dcc=set.getInt(8);
				String coupondates=set.getString(9);
				sec =new Security(secid, secname, issuername, facevalue, couponrate, frequency, matdate, dcc, coupondates, ISIN1);
				secList.add(sec);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return secList;
//		List<Security> HardCodeList = new ArrayList<Security>(); 
//		Security sec = new Security(123, "Security", "FMCG", 100f, 2.32f, 2, null, 23-12-2000, null	, "ISIN123");
//		HardCodeList.add(sec);
//		return HardCodeList;
	}

}
