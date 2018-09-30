package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Accrued;
import com.beans.Trade;
import com.daos.AccruedDAO;
import com.daos.TradeDAO;
import com.impl.AccruedDAOImpl;
import com.impl.TradeDAOImpl;

/**
 * Servlet implementation class showDetailsTrade
 */
@WebServlet("/showDetailsTrade")
public class showDetailsTrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showDetailsTrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int tradeId = Integer.parseInt(request.getParameter("tradeId"));
		TradeDAO dao= new TradeDAOImpl();
		Trade trade= dao.findTradeByTradeId(tradeId);
		List<Trade> tradeList = new ArrayList<Trade>();
		tradeList.add(trade);
		
		request.setAttribute("tradeList", tradeList);
		request.getRequestDispatcher("dashboard/TradeDetails.jsp").forward(request, response);

	}

}
