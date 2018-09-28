package com.daos;

import com.beans.User;

public interface UserDAO {
	int addUser(User user);
	User findUserbyUsername(String Username);
	// TODO: Implement modifyUser
	int modifyUser(User user);
	int deleteUser(String Username);

}
