package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Accrued;
import com.daos.AccruedDAO;
import com.impl.AccruedDAOImpl;

/**
 * Servlet implementation class accrued
 */
@WebServlet("/showAccrued")
public class showAccrued extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAccrued() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int tradeId = Integer.parseInt(request.getParameter("tradeId"));
		AccruedDAO dao = new AccruedDAOImpl();
		List<Accrued> accrued = dao.findAccruedByTradeId(tradeId);
		request.setAttribute("accValues", accrued);
		request.getRequestDispatcher("dashboard/accruedTable.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
