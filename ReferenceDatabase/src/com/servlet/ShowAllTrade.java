package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Trade;
import com.daos.TradeDAO;
import com.impl.TradeDAOImpl;

/**
 * Servlet implementation class ShowAllTrade
 */
@WebServlet("/ShowAllTrade")
public class ShowAllTrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllTrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int userId=Integer.parseInt(request.getParameter("userid"));
		int userId=2;
		TradeDAO dao = new TradeDAOImpl();
		List<Trade> tradeList= dao.findTradeByUser(userId);
		request.setAttribute("tradeList",tradeList);
		request.getRequestDispatcher("ShowTradeByUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
