package com.servlet;

import java.io.IOException;

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
 * Servlet implementation class show
 */
@WebServlet({ "/showservlet" })
public class show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	System.out.println("Hello i got here");
	SecurityDAO dao= new SecurityDAOImpl();
	Security security =dao.findSecuritybyISIN("US1234576EW");
	request.setAttribute("security",security);
	RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
	dispatcher.forward(request,response);
	
	
	}

}
