package com.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.beans.Accrued;
import com.beans.Security;
import com.connections.DatabaseConnection;
import com.daos.AccruedDAO;

public class AccruedDAOImpl implements AccruedDAO {

	@Override
	public int addAccrued(List<Accrued> list,int tradeId) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		String ADD_ACCRUED="INSERT INTO ACCRUEDS VALUES(?,?,?)";
		
		Connection con=DatabaseConnection.openConnection();
		for(Accrued accrued: list) {
			try {
				PreparedStatement ps=con.prepareStatement(ADD_ACCRUED);
				ps.setInt(1, accrued.getAccruedDays());
				ps.setFloat(2, accrued.getAccruedInterest());
				ps.setInt(3, tradeId);
				
			
			rowsAdded=rowsAdded+ps.executeUpdate();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO Handle exceptions properly
				e.printStackTrace();
			}
		}
		return rowsAdded;
	}

	@Override
	public List<Accrued> findAccruedByTradeId(int tradeId) {
		// TODO Auto-generated method stub
		List<Accrued> accrued = new ArrayList<Accrued>();
		String FIND_BY_TRADE="SELECT * FROM ACCRUED WHERE TRADEID=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_TRADE);
			ps.setInt(1, tradeId);
			ResultSet set=ps.executeQuery();
			
			while(set.next()){	
				int days = set.getInt(3);
				//System.out.println(days);
				float interest = set.getFloat(2);
				//System.out.println(interest);
				Accrued ac = new Accrued(days, interest);
				//System.out.println(ac.getAccruedDays()+" "+ac.getAccruedInterest());
				accrued.add(ac);
				
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return accrued;

	}

}
