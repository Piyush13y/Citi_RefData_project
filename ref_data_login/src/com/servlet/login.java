package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.User;
import com.daos.UserDAO;
import com.impl.UserDAOImpl;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		//System.out.println(username+password);
//		
//		UserDAO dao = new UserDAOImpl();
//		//User u = dao.findUserbyUsername(username);
//		System.out.println(username);
////		if(u.getUsername().equals(username) && u.getPasscode().equals(password)) {
////			request.setAttribute("user",username);
////			RequestDispatcher dispatch = request.getRequestDispatcher("dashboard.jsp");
////			dispatch.forward(request, response);			
////		}else {
////			
////		}
////		
//		
//		
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + password);
		
//		RequestDispatcher dispatch = request.getRequestDispatcher("dashboard.jsp");
//		dispatch.forward(request, response);
	}

}
