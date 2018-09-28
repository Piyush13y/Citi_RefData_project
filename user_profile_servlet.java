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

import sun.print.resources.serviceui_es;

/**
 * Servlet implementation class user_profile_servlet
 */
@WebServlet("/user_profile_servlet")
public class user_profile_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_profile_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UserDAO dao= new UserDAOImpl();
		HttpSession session = request.getSession();
String USERNAME = (String)session.getAttribute("USERNAME");
String USERFNAME=request.getParameter("USERFNAME");
String USERLNAME=request.getParameter("USERLNAME");
String CONTACT=request.getParameter("CONTACT");
String GENDER=request.getParameter("GENDER");

System.out.println(USERNAME+USERFNAME+USERLNAME+CONTACT+GENDER);

User user=dao.findUserbyUsername(USERNAME);
//user.setUsername(USERNAME);
user.setUserFname(USERFNAME);
user.setUserLname(USERLNAME);
user.setGender(GENDER);
user.setContact(CONTACT);

int i =dao.modifyUser(user);

if(i>0)
	System.out.println("modified");
else System.out.println("no modification");
//User user=  new User(id, username, passcode, USERFNAME, USERLNAME, gender, contact)
request.setAttribute("usersrv", user);
response.sendRedirect("./dashboard/home.jsp");
	
	
	
	}

}
