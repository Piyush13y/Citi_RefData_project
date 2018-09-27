package com.tests;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class rigoroustest{

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
		User user = new User(null,"Manan", "Temp","manan","jain","234567","male");
		int actual = userDAO.addUser(user);
		
		assertEquals(expected, actual);
	}
	
		
	@Test
	void test1() {
//		String username="Manan";
//		String passcode="Temp";
//		String userfmane="manan";
//		String userlname="jain";
//		String gender="male";
//		String contact="234567";
//		String expected=passcode;
		
		String expected="newq";
		UserDAO userDAO = new UserDAOImpl();
		userDAO.addUser(new User(null, "john", "newq", "quinonw", "methanol", "m", "23456"));
		
		User user = userDAO.findUserbyUsername("john");
		
		String actual = user.getPasscode();
		
		assertTrue(expected.equals(actual));
	}
	
	@Test
	void test2() {
		
		UserDAO userDAO = new UserDAOImpl();
		userDAO.addUser(new User(null, "jimmy", "news", "quinone", "metha", "m", "234"));
	
		String username="jimmy";
		int expected = 1;
		
		
		int actual = userDAO.deleteUser(username);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void test3() {
		int expected = 1;
		
		SecurityDAO dao= new SecurityDAOImpl();
		Security security = new Security(null, "Rel", "REL", 100.02f, 0.02f, 2, new Date(2018, 9, 21), 35, "fGFG","iSIN");
		int actual = dao.addSecurity(security);
		
		assertEquals(expected, actual);
	}
	

	@Test
	void test4() {
		
		
		SecurityDAO dao=new SecurityDAOImpl();
		Security security = new Security(null, "jpmorgan", "RELiance", 100.02f, 0.02f, 2, new Date(2018, 9, 21), 35, "fGhd","nitin");
		
		dao.addSecurity(security);
		Security security1=dao.findSecuritybyISIN(security.getISIN());
		int actual=security1.getSecId();
		int expected=3;
		
		
         assertEquals(expected, actual);
		
		
	}
	@Test
	void test5()
	{int expected=1;
	SecurityDAO dao=new SecurityDAOImpl();
	
	Security security = new Security(null, "jpmorgan", "RELiance", 100.02f, 0.02f, 2, new Date(2018, 9, 21), 35, "fGhd","nitina");
	
	dao.addSecurity(security);
	
	int actual=dao.deleteSecurity("nitina");
	
	assertEquals(expected, actual);

		
	}
	
	@Test
	void test6() {
		int expected=1;
		UserDAO dao=new UserDAOImpl();
		dao.addUser(new User(null, "mahak", "temp", "rut", "", "", ""));
		User user=new User(null, "mahak", "manan", "tur", "", "", "");
		
		int actual=dao.modifyUser(user);
		assertEquals(expected, actual);
	}
	@Test
	void test7() {
		int expected=1;
		List<Accrued> acc=new ArrayList<Accrued>();
		acc.add(new Accrued(23,67.98f,"agd",65.56f));
		TradeDAO dao=new TradeDAOImpl();
		User user=new User(1,"username", "passcode", "", "", "", "");
		Security sec=new Security(1, "ghjk", "ytre", 34.27f, 23.56f, 23,new Date(2018, 12, 22), 1, "see", "SIN");
		Trade trade= new Trade(null,new Date(2018,9,26),new Time(3,34,45),"buy","100-12","coun",
				new Date(2018, 12, 26),acc,new Date(2018, 12,26),34.76f,56.65f,45.34f,sec,user);
		
		int actual=dao.addTrade(trade);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test8() {
		//int expected=1;
		TradeDAO dao=new TradeDAOImpl();
		User user=new User(1,"username", "passcode", "", "", "", "");
		Security sec=new Security(1, "ghjk", "ytre", 34.27f, 23.56f, 23,new Date(2018, 12, 22), 1, "see", "SIN");
		Trade trade= new Trade(null,new Date(2018,9,26),new Time(3,34,45),"sell","100-12","coun",
				new Date(2018, 12, 26),null,new Date(2018, 12,26),34.76f,56.65f,45.34f,sec,user);
		dao.addTrade(trade);
		Trade trade1 = dao.findTradeByTradeId(2);
		
		int actual=trade.getSecDetails().getSecId();
		int actual1=(int)trade.getUserDetails().getId();
		System.out.println(actual+"\n" +actual1);
		
		assertEquals((int)sec.getSecId(), actual);
		assertEquals((int)user.getId(), actual1);
	
	}
	
	@Test
	void test9() {
		int expected=2;
		TradeDAO dao=new TradeDAOImpl();
		User user=new User(1,"username", "passcode", "", "", "", "");
		Security sec=new Security(1, "ghjk", "ytre", 34.27f, 23.56f, 23,new Date(2018, 12, 22), 1, "see", "SIN");
		Trade trade= new Trade(null,new Date(2018,9,26),new Time(3,34,45),"selling","100-12","coun",
				new Date(2018, 12, 26),null,new Date(2018, 12,26),34.76f,56.65f,45.34f,sec,user);
		int actual=dao.deleteTrade(3);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	
	
}
