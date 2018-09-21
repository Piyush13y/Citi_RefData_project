package com.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.User;
import com.connections.DatabaseConnection;
import com.daos.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public int addUser(User user) {
		int rowsAdded=0;
		String ADDUSER="INSERT INTO USERS VALUES(?,?)";
		
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDUSER);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPasscode());
			
			rowsAdded=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO Handle exceptions properly
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public User findUserbyUsername(String Username) {
		User user=null;
		String FIND_BY_USERNAME="SELECT * FROM USERS WHERE USERNAME=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_USERNAME);
			ps.setString(1, Username);
			ResultSet set=ps.executeQuery();
			
			if(set.next())
			{
				String Passcode = set.getString("passcode");
				user=new User(Username, Passcode);				
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public int deleteUser(String Username) {
		int rowsModified=0;
		String REMOVE_USER="DELETE FROM USERS WHERE USERNAME=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(REMOVE_USER);
			ps.setString(1, Username);
			rowsModified = ps.executeUpdate();			
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowsModified;
	}

}
