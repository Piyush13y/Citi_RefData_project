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
		String ADDUSER="INSERT INTO USERS VALUES(?,?,?,?,?,?)";
		
		Connection con=DatabaseConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDUSER);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPasscode());
			ps.setString(3, user.getUserFname());
			ps.setString(4, user.getUserLname());
			ps.setString(5, user.getGender());
			ps.setString(6,user.getContact());
			rowsAdded = ps.executeUpdate();
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
				Integer userID = set.getInt("userid");
				String Passcode = set.getString("passcode");
				String user_fname = set.getString("userFname");
				String user_lname = set.getString("userLname");
				String contact = set.getString("contact");
				
				String gender = set.getString("gender");
			
				user=new User(userID, Username, Passcode,user_fname,user_lname,gender,contact);				
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

	@Override
	public int modifyUser(User user) {
		// TODO Auto-generated method stub
		int rowsModified=0;
		String MODIFY_USER="UPDATE USERS SET USERS.PASSCODE=?, USERS.USERFNAME=? ,USERS.USERLNAME=?, USERS.CONTACT=? ,USERS.GENDER=? WHERE USERNAME=?";
		
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(MODIFY_USER);
			ps.setString(6, user.getUsername());
			ps.setString(1, user.getPasscode());
			ps.setString(2, user.getUserFname());
			ps.setString(3, user.getUserLname());
			ps.setString(4, user.getContact());
			ps.setString(5, user.getGender());
			rowsModified = ps.executeUpdate();	
		
		
//			ResultSet set=ps.executeQuery();
//			
//			if(set.next())
//			{
//				
//				String Passcode = set.getString("passcode");
//				String user_fname = set.getString("userFname");
//				String user_lname = set.getString("userLname");
//				String contact = set.getString("contact");
//				String gender = set.getString("gender");
//			
//				user=new User(null, user.getUsername(), Passcode,user_fname,user_lname,contact,gender);				
//			
//				
//			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return rowsModified;
		
	}

	@Override
	public User findUserByuserId(int userId) {
		User user=null;
		String FIND_BY_USERID="SELECT * FROM USERS WHERE USERID=?";
		try(Connection con=DatabaseConnection.openConnection();)
		{
			PreparedStatement ps=con.prepareStatement(FIND_BY_USERID);
			ps.setInt(1, userId);
			ResultSet set=ps.executeQuery();
			
			if(set.next())
			{
				Integer userID = set.getInt("userid");
				String userName = set.getString("username");
				String Passcode = set.getString("passcode");
				String user_fname = set.getString("userFname");
				String user_lname = set.getString("userLname");
				String contact = set.getString("contact");
				String gender = set.getString("gender");
			
				user=new User(userID, userName, Passcode,user_fname,user_lname,gender,contact);				
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return user;
	}

//	@Override
//	public int findUserId(String userName) {
//		// TODO Auto-generated method stub
//		int id =0;
//		String FIND_BY_USERNAME="SELECT * FROM USERS WHERE USERNAME=?";
//		try(Connection con=DatabaseConnection.openConnection();)
//		{
//			PreparedStatement ps=con.prepareStatement(FIND_BY_USERNAME);
//			ps.setString(1, username);
//			ResultSet set=ps.executeQuery();
//			
//			if(set.next())
//			{
//				Integer userID = set.getInt("userid");
//				String Passcode = set.getString("passcode");
//				String user_fname = set.getString("userFname");
//				String user_lname = set.getString("userLname");
//				String contact = set.getString("contact");
//				
//				String gender = set.getString("gender");
//			
//				user=new User(userID, Username, Passcode,user_fname,user_lname,gender,contact);				
//			}
//		} catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		return user;
//
//	}

}
