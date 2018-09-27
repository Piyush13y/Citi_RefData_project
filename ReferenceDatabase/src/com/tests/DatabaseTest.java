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
		User user = new User(null,"Manant", "Temp","manan","jain","234567","male");
		int actual = userDAO.addUser(user);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		String username="Manan";
		String passcode="Temp";
		String userfmane="manan";
		String userlname="jain";
		String gender="male";
		String contact="234567";
		String expected=passcode;
		
		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.findUserbyUsername(username);
		
		String actual = user.getPasscode();
		
		assertTrue(expected.equals(actual));
	}
	
	@Test
	void test2() {
		String username="Mananj";
		int expected = 1;
		
		UserDAO userDAO = new UserDAOImpl();
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
		dao.addUser(new User(null, "mahak", "temp", "", "", "", ""));
		User user=new User(null, "mahak", "manan", "", "", "", "");
		
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
		int tradeId=2;
		int secid=2;
		int id=1;
		Trade trade = dao.findTradeByTradeId(tradeId);
		
		int actual=trade.getSecDetails().getSecId();
		int actual1=(int)trade.getUserDetails().getId();
		System.out.println(actual+"\n" +actual1);
		
		assertEquals(secid, actual);
		assertEquals(id, actual1);
	
	}
	
	@Test
	void test9() {
		int expected=2;
		TradeDAO dao=new TradeDAOImpl();
		int actual=dao.deleteTrade(5);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
List<Trade> listExp=new ArrayList<>();
		
		User user=new User(1,"username", "passcode","","","","");
		//Security sec=new Security(1, "ghjk", "ytre", 34.27f, 23.56f, 23, 
				//new Date(2018, 12, 22), 1, "see", "SIN");
		
	Trade expected= new Trade(9,new Date(2018,9,26),new Time(3,34,45),"BUY","100-30","WED",
				new Date(2018, 12, 26),null,new Date(2018, 12,26),
				34.76f,56.65f,45.34f,null,user);
	System.out.println(new Date(2018,9,26));
		listExp.add(expected);
		TradeDAO dao=new TradeDAOImpl();
		List<Trade> listActu=dao.findTradeByUserId(user);
		//System.out.println(listActu);
		System.out.println(listExp.get(0)+"\n"+listActu.get(1));
		Date actual=listActu.get(1).getSettlementDate();
		
		assertEquals(listExp.get(0).getSettlementDate(), actual);
		assertEquals(listExp.get(0).getTradePrice(),listActu.get(0).getTradePrice());
	
	}
	
	@Test
	void test11() {
List<Trade> listExp=new ArrayList<>();
		
		//User user=new User(1,"username", "passcode");
		Security sec=new Security(1, "WED","WED", 23.12f, 23.12f, 12, 
				new Date(2018, 02, 03), 12, "WES", "QWE");
		
//		Trade expected= new Trade(6,new Date(2018,9,26),new Time(3,34,45),"BUY","100-30","WED",
//				new Date(2018, 12, 26),null,new Date(2018, 12,26),
//				34.76f,56.65f,45.34f,sec,null);
	Trade expected= new Trade(9,new Date(2018,9,26),new Time(3,34,45),"buy","100-12","coun",
				new Date(2018, 12, 26),null,new Date(2018, 12,26),
				34.76f,56.65f,45.34f,sec,null);
	
		listExp.add(expected);
		TradeDAO dao=new TradeDAOImpl();
		List<Trade> listActu=dao.findTradeBySecId(sec);
		
		//Trade actual;
		Date actual=listActu.get(0).getTradeDate();
//		System.out.println(actual+" "+listExp.get(0).getTradeDate());
		System.out.println(listActu.get(1)+"\n"+listExp.get(0));
		assertEquals(listExp.get(0).getTradeDate(), actual);
		assertEquals(listExp.get(0).getSettlementDate(),listActu.get(1).getSettlementDate());
		assertEquals(listExp.get(0).getLastCouponDate(), listActu.get(1).getLastCouponDate());
		assertEquals(listExp.get(0).getCleanPrice(), listActu.get(1).getCleanPrice(),0.1);
		
	}
	
	@Test
	void test12() {
		TradeDAO dao=new TradeDAOImpl();
		HashMap<String, Integer> pie=dao.findAllTradesCount();
		System.out.println(pie);
	}
	@Test
	void test13() {
		TradeDAO dao=new TradeDAOImpl();
		List<Trade> list = new ArrayList<Trade>();
		list=dao.findAllTrades();
		System.out.println(list);
	}
	@Test
	void test14()
	{
		int expected=1;
		UserDAO userDAO = new UserDAOImpl();
		User user = new User(null,"Manan", "Temporary","manyata","jai","male","");
		int actual = userDAO.modifyUser(user);
		
		assertEquals(expected, actual);
	
	}
	
	}
	

