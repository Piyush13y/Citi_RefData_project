package com.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
@WebServlet("/addSecurities")
public class addSecurities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addSecurities() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private int get(int giveme) {
    	return giveme+1;
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String securityName = request.getParameter("SECURITY_NAME");
		int frequency = Integer.parseInt(request.getParameter("FREQUENCY"));
		int dayCountConvention = Integer.parseInt(request.getParameter("DAY_COUNT_CONVENTION"));
		String iSIN = request.getParameter("ISIN");
		Double faceValue = Double.parseDouble(request.getParameter("FACE_VALUE"));
		String cDates = request.getParameter("COUPON_DATES");
		//System.out.println(cDates);
		//System.out.println(get(2));
		SecurityDAOImpl secdao= new SecurityDAOImpl();
		ArrayList<Date> couponDates = secdao.stringToDateArray(cDates);
		System.out.println(request.getParameter("MATURITY_DATE"));
		
		Date maturityDate=null;
		try {
			maturityDate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("MATURITY_DATE")).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String issuerName = request.getParameter("ISSUER_NAME");
		Double couponRate = Double.parseDouble(request.getParameter("COUPON_RATE")); 
		Double tickSize = Double.parseDouble(request.getParameter("TICK_SIZE"));
		
		Security security = new Security(null, securityName, issuerName, faceValue, couponRate, frequency, maturityDate, dayCountConvention, tickSize, couponDates, iSIN);
		System.out.println(security);
		SecurityDAO dao= new SecurityDAOImpl();
	    int row=dao.addSecurity(security);
		
	    if(row>0) {
			System.out.println("added");
			RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
			dispatcher.forward(request,response);
	    } else {
		 System.out.println("unsuccessful");
	     request.setAttribute("security",security);
		}
//		RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
//		dispatcher.forward(request,response);
	}

}
