package com.servlet;
import com.beans.Trade;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algo.DynamicDataCal;
import com.algo.DynamicDataCalImpl;
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
		//System.out.println("username is:-"+uname);
		UserDAO udao = new UserDAOImpl();
		User userDetails = udao.findUserbyUsername(uname);
		
		String tradeType = request.getParameter("tradeType");
		String counterparty = request.getParameter("counterparty");
		
		Double tradePrice=250d;
		System.out.println("some");
		System.out.println("decimal: "+request.getParameter("decimal"));
		if(request.getParameter("decimal")!="") {
			tradePrice=Double.parseDouble(request.getParameter("decimal"));
		} else {
			 tradePrice= Double.parseDouble(request.getParameter("fractionWhole"))+(Double.parseDouble(request.getParameter("fractionPart"))/32);
		}
//		String[] tDate= request.getParameter("tradeDate").split("-");
//		int [] tDateArray = new int[tDate.length];
//		for(int i=0;i<tDate.length;i++) {
//			tDateArray[i]=Integer.parseInt(tDate[i]);
//		}
		Date tradeDate=null;
		try {
			tradeDate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("tradeDate")).getTime());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date settlementDate = null;
		if(request.getParameter("settlementDate").equals("0")) {
			try {
				settlementDate= new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("tradeDate")).getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (request.getParameter("settlementDate").equals("1")) {
			DynamicDataCal cal = new DynamicDataCalImpl(3);
			try {
				settlementDate= cal.dateDaysAfter(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("tradeDate")).getTime()), 1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			DynamicDataCal cal = new DynamicDataCalImpl(3);
			try {
				settlementDate= cal.dateDaysAfter(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("tradeDate")).getTime()), 2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Time tradeTime=null;
		try {
			tradeTime = new java.sql.Time(new SimpleDateFormat("HH:mm:ss").parse("11:10:07").getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(request.getParameter("secName"));
		int securityId = Integer.parseInt(request.getParameter("secName"));
		SecurityDAO daosec = new SecurityDAOImpl();
		Security security = daosec.findSecuritybySecurityId(securityId);
		Double marketPrice=0d;
		TradeDAO dao = new TradeDAOImpl();
		List<Trade> td= dao.findAllTradesBySecurityId(security.getSecId());
		if(td.size()==0) {
			marketPrice=tradePrice;
		} else {
			marketPrice=td.get(0).getTradePrice();
		}
		Integer tradeId=null;	
		Float cleanPrice=null;
		Float dirtyPrice=null;
		Float ticks=null;
		java.sql.Date lastCouponDate=null;
		List<Accrued> accrued=null;				
		Trade trade = new Trade(tradeId, tradeDate, tradeTime, tradeType, marketPrice, null, tradePrice, null, counterparty, settlementDate, null, null, null, null, null, security, userDetails);
		
		int dayCountConvention = security.getDayCountConvention();
		DynamicDataCal dynamicData = new DynamicDataCalImpl(dayCountConvention);
		dynamicData.initializeTrade(trade);
		accrued=trade.getAccrued();
		
		//TO DO add to accrued table
		
		
		System.out.println(trade);
		int result = dao.addTrade(trade);
		if(result>0) {
			request.setAttribute("successmessage", "Trade added successfully");
			//request.setAttribute("accValues", accrued);
			//request.setAttribute("tradeDetails", trade);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("./dashboard/home.jsp");
//			dispatcher.forward(request, response);
			HttpSession session = request.getSession();
			List<Trade> tradeLst = dao.findTradeByUser(userDetails.getId());
			session.setAttribute("tradeList", tradeLst);
			response.sendRedirect("./dashboard/home.jsp");
		} else {
			request.setAttribute("errormessage", "Error! Please try again!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("./dashboard/home.jsp");
			dispatcher.forward(request, response);
		}
	}


}
