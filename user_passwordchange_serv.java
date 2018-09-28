package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.User;
import com.daos.UserDAO;
import com.impl.UserDAOImpl;
import com.sun.org.apache.bcel.internal.generic.DALOAD;

/**
 * Servlet implementation class user_passwordchange_serv
 */
@WebServlet("/user_passwordchange_serv")
public class user_passwordchange_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_passwordchange_serv() {
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
	
	
	HttpSession session=request.getSession();
	User existingPassword=(User)session.getAttribute("userdetails");
	User user=dao.findUserbyUsername(existingPassword.getUsername());
	
	String oldPassword=request.getParameter("oldPassword");
	String newPassword=request.getParameter("newPassword");
	String confirmPassword=request.getParameter("confirmPassword");
//	request.setAttribute(arg0, arg1);
	System.out.println(existingPassword.getPasscode()+oldPassword+newPassword+confirmPassword);
	
	if(oldPassword.equals(existingPassword.getPasscode()))
	{System.out.println("old matched");
	if(newPassword.equals(confirmPassword))
	{
user.setPasscode(newPassword);		
	System.out.println("changed");
	}
	}else {
		
request.setAttribute("errmsg", "your password doesnot match");
	}
	
	dao.modifyUser(user);
	response.sendRedirect("./dashboard/home.jsp");
	}

}