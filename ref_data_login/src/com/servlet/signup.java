package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.User;
import com.daos.UserDAO;
import com.impl.UserDAOImpl;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("email");
//		String uname = request.getParameter("uname");
		String password = request.getParameter("passcode");
		System.out.println(userid+":"+password); 
		
		UserDAO dao = new UserDAOImpl();
		User user = dao.findUserbyUsername(userid);
		if(user==null) {
			User u = new User(userid,password);
			int k = dao.addUser(u);
			if(k>0) {
				
				HttpSession session = request.getSession();
				String msg = "User added successfully";
				session.setAttribute("message", msg);
				response.sendRedirect("index.jsp");
				//request.setAttribute("message","User added successfully");
		
			} else {
				
				request.setAttribute("err","Error! Please try again.");
				RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
				dispatch.forward(request, response);	
			}
			
		} else {
			request.setAttribute("err","Error! Username already exist.");
			RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
			dispatch.forward(request, response);
		}
			
	}

}
