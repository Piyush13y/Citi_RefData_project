package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.beans.Trade;
import com.beans.User;
import com.daos.TradeDAO;
import com.impl.TradeDAOImpl;

class DBTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
List<Trade> listExp=new ArrayList<>();
		
		User user=new User(1,"username", "passcode");
		//Security sec=new Security(1, "ghjk", "ytre", 34.27f, 23.56f, 23, 
				//new Date(2018, 12, 22), 1, "see", "SIN");
		
	Trade expected= new Trade(7,new Date(2018,9,26),new Time(3,34,45),"buy","100-12","coun",
				new Date(2018, 12, 26),null,new Date(2018, 12,26),
				34.76f,56.65f,45.34f,null,user);
		listExp.add(expected);
		TradeDAO dao=new TradeDAOImpl();
		List<Trade> listActu=dao.findTradeByUserId(user);
		
		Trade actual=listActu.get(0);
		assertEquals(listExp.get(0), actual);
	
		
		
		
	}

}
