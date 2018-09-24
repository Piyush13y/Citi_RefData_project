package com.testing;

import com.beans.User;
import com.daos.UserDAO;
import com.impl.UserDAOImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao= new UserDAOImpl();
		User u = dao.findUserbyUsername("123");
		System.out.println(u);
	}

}
