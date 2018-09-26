package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.beans.Accrued;
import com.beans.Security;
import com.beans.Trade;
import com.beans.User;
import com.daos.SecurityDAO;
import com.daos.TradeDAO;
import com.daos.UserDAO;
import com.impl.SecurityDAOImpl;
import com.impl.TradeDAOImpl;
import com.impl.UserDAOImpl;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

class DatabaseTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		int expected = 1;
		
		UserDAO userDAO = new UserDAOImpl();
		User user = new User(100, "test", "test_password");
		int actual = userDAO.addUser(user);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		String username="test";
		String passcode="test_password";
		String expected=passcode;
		
		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.findUserbyUsername(username);
		
		String actual = user.getPasscode();
		
		assertTrue(expected.equals(actual));
	}
	
	@Test
	void test2() {
		String username="test";
		int expected = 1;
		
		UserDAO userDAO = new UserDAOImpl();
		int actual = userDAO.deleteUser(username);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		int expected = 1;
		
		SecurityDAO dao= new SecurityDAOImpl();
		Security security = new Security(1, "Rel", "REL", 100.02f, 0.02f, 2, new Date(2018, 9, 21), 35, "fGFG","iSIN");
		int actual = dao.addSecurity(security);
		
		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		int expected=1;
		SecurityDAO dao=new SecurityDAOImpl();
		Security security=dao.findSecuritybyISIN("iSIN");
		
		int actual=security.getSecId();
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void test5() {
		int expected=1;
		SecurityDAO dao=new SecurityDAOImpl();
		int actual=dao.deleteSecurity("iSIN");
		
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		int expected=1;
		UserDAO dao=new UserDAOImpl();
		dao.addUser(new User(null, "mahak", "temp"));
		User user=new User(null, "mahak", "manan");
		
		int actual=dao.modifyUser(user);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		int expected=1;
		List<Accrued> acc=new ArrayList<Accrued>();
		acc.add(new Accrued(23,67.98f,"agd",65.56f));
		TradeDAO dao=new TradeDAOImpl();
		User user=new User(null,"username", "passcode");
		Security sec=new Security(12, "ghjk", "ytre", 34.27f, 23.56f, 23, 
				new Date(2018, 12, 22), 12, "see", "SIN");
		Trade trade = new Trade();
//		Trade trade= new Trade(12,new Date(2018,9,26),new Time(3,34,45),"reli","buy","100-12","coun",
//				new Date(2018, 12, 26),acc,new Date(2018, 12,26),
//				34.76f,56.65f,45.34f,sec,user);
		
		dao.addTrade(trade);
	}
}
