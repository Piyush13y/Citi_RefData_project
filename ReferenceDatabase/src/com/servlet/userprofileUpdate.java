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
 * Servlet implementation class user_profile_servlet
 */
@WebServlet("/userProfileUpdate")
public class userprofileUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userprofileUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UserDAO dao= new UserDAOImpl();
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");
		String USERFNAME=request.getParameter("fname");
		String USERLNAME=request.getParameter("lname");
		String CONTACT=request.getParameter("contact");
		String GENDER=request.getParameter("gender");
		
		user.setUserFname(USERFNAME);
		user.setUserLname(USERLNAME);
		user.setGender(GENDER);
		user.setContact(CONTACT);
		
		int i = dao.modifyUser(user);
		
		if(i>0) {
			session.setAttribute("modificationMessage", "User updated successfully.");
			session.setAttribute("user", user);
			response.sendRedirect("./dashboard/home.jsp");
		} else {	
			session.setAttribute("modificationMessage", "Error! Failed to update user.");
			session.setAttribute("user", user);
			response.sendRedirect("./dashboard/home.jsp");
		}
	}

}
