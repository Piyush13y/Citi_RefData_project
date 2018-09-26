package com.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Security;
import com.daos.SecurityDAO;
import com.impl.SecurityDAOImpl;

/**
 * Servlet implementation class add_securities
 */
@WebServlet("/add_securities_servlet")
public class add_securities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_securities() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("PIYUUSH");
		
		String SECURITY_NAME=request.getParameter("SECURITY_NAME");
		String ISSUER_NAME=request.getParameter("ISSUER_NAME");
		int FREQUENCY=Integer.parseInt(request.getParameter("FREQUENCY"));
		int DAY_COUNT_CONVENTION=Integer.parseInt(request.getParameter("DAY_COUNT_CONVENTION"));
		String ISIN=request.getParameter("ISIN");
		float FACE_VALUE=Float.parseFloat(request.getParameter("FACE_VALUE"));
		String COUPON_DATES=request.getParameter("COUPON_DATES");
		SimpleDateFormat format=new SimpleDateFormat("yyyy Mm dd");
		
		Date MATURITY_DATE = new Date(2018, 2, 2);
		try {
			MATURITY_DATE = (Date) format.parse(request.getParameter("MATURITY_DATE"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Security security=new Security(10101, SECURITY_NAME, ISSUER_NAME, FACE_VALUE, 4.23f, FREQUENCY, MATURITY_DATE, DAY_COUNT_CONVENTION, COUPON_DATES, ISIN);
		
				
				//System.out.println("ISIN="+ISIN);
	SecurityDAO dao= new SecurityDAOImpl();
     int row=dao.addSecurity(security);
	if(row>0)
		System.out.println("added");
	else
		System.out.println("unsuccessful");
     request.setAttribute("security",security);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
	dispatcher.forward(request,response);
	

		
		
	}

}
