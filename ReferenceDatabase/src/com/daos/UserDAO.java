package com.daos;

import com.beans.User;

public interface UserDAO {
	int addUser(User user);
	User findUserbyUsername(String Username);
	User findUserByuserId(int userId);
	int modifyUser(User user);
	int deleteUser(String Username);
	//int findUserId(String userName);
	

}