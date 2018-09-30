package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.beans.Security;
import com.connections.DatabaseConnection;
import com.daos.SecurityDAO;
import com.impl.SecurityDAOImpl;

/**
 * Servlet implementation class show
 */
@WebServlet({ "/showAllSecurity" })
public class showAllSecurities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAllSecurities() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    	String ISIN=request.getParameter("ISIN");
    	//System.out.println("ISIN="+ISIN);
    	SecurityDAO dao= new SecurityDAOImpl();
    	List<Security> securities =dao.findAllSecurities();
//    	for(Security security :securities) {
//    		System.out.println(security.getiSIN());
//    	}
    	request.setAttribute("securityList",securities);
	
    	RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
    	dispatcher.forward(request,response);
	
	
	}
}
