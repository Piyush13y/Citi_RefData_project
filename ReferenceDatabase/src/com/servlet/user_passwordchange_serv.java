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


/**
 * Servlet implementation class user_passwordchange_serv
 */
@WebServlet("/userpasswordchange")
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	UserDAO dao= new UserDAOImpl();
	String username =  request.getParameter("username");
	//System.out.println(u);
	HttpSession session=request.getSession();
//	User existingPassword=(User)session.getAttribute("user");
//	System.out.println(existingPassword);
	
	User user=dao.findUserbyUsername(username);
	System.out.println(user);
	
	String oldPassword=request.getParameter("oldpass");
	String newPassword=request.getParameter("newpass");
	String confirmPassword=request.getParameter("newpass1");

		if(oldPassword.equals(user.getPasscode())){
			//System.out.println("old matched");
			user.setPasscode(newPassword);		
			dao.modifyUser(user);
			System.out.println("done");
			session.setAttribute("user", user);
			session.setAttribute("modificationMessage", "Password changed successfully");
			response.sendRedirect("./dashboard/home.jsp");
		} else {	
			 System.out.println("err");
			 session.setAttribute("user", user);
		     session.setAttribute("modificationMessage", "Error! Old password didn't match");
		     response.sendRedirect("./dashboard/home.jsp");
		}

	}

}