package com.servlet;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Accrued;
import com.beans.Security;
import com.beans.Trade;
import com.beans.User;
import com.daos.TradeDAO;
import com.daos.UserDAO;
import com.impl.TradeDAOImpl;
import com.impl.UserDAOImpl;

/**
 * Servlet implementation class addTrade
 */
@WebServlet("/addTrade")
public class addTrade extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addTrade() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("user");
		UserDAO udao = new UserDAOImpl();
		User userDetails = udao.findUserbyUsername(uname);
		Time tradeTime=null;
		Date tradeDate=null;
		Date settlementDate=null;
		SimpleDateFormat formate = new SimpleDateFormat("yyyy MM DD");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		try {
			 tradeDate = formate.parse(request.getParameter("tradeDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			tradeTime = (Time) time.parse(request.getParameter("time"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tradeType = request.getParameter("tradetype");
		String tradePrice = request.getParameter("tradeprice");
		String counterparty = request.getParameter("counterparty");
		try {
			settlementDate = formate.parse(request.getParameter("settlementdate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Accrued> list = new ArrayList<>();
		list = null;
		int secId = 0;
		String securityName = "a";
		String issuerName = "w";
		float faceValue = 23f;
		float couponRate = 2.3f;
		int frequency = 6;
		Date maturityDate = new Date(2018, 2, 2);
		int dayCountConvention = 9;
		String couponDates = "www";
		String iSIN = "11111";
		Security sec = new Security(secId, securityName, issuerName, faceValue, couponRate, frequency, (java.sql.Date) maturityDate, dayCountConvention, couponDates, iSIN);
		float ticks = 0;
		Integer i = 0;
		Trade trade = new Trade(i, (java.sql.Date)tradeDate, tradeTime, tradeType, tradePrice, counterparty, (java.sql.Date)settlementDate, list, (java.sql.Date)settlementDate, ticks, 0f, 0f, sec, userDetails);

		TradeDAO dao = new TradeDAOImpl();
		int result = dao.addTrade(trade);
		if(result>0) {
			request.setAttribute("successmessage", "Trade added successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("errormessage", "Error! Please try again!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
	}


}
