package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Security;
import com.beans.Trade;
import com.beans.User;
import com.daos.SecurityDAO;
import com.daos.TradeDAO;
import com.daos.UserDAO;
import com.impl.SecurityDAOImpl;
import com.impl.TradeDAOImpl;
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
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDAO dao = new UserDAOImpl();
		User u = dao.findUserbyUsername(username);
		//System.out.println(u);
		if(u==null) {
			request.setAttribute("error","Username doesn't exist.");
			RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
			dispatch.forward(request, response);
			
		}else {
			
			if(u.getUsername().equals(username) && u.getPasscode().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", u);
				SecurityDAO secdao = new SecurityDAOImpl();
				List<Security> secList= secdao.findAllSecurities();
				session.setAttribute("secList", secList);
				TradeDAO trDAO= new TradeDAOImpl();
				List<Trade> tradeList = trDAO.findTradeByUser(u.getId());
				session.setAttribute("tradeList", tradeList);
				response.sendRedirect("./dashboard/home.jsp");
			}else {
				request.setAttribute("error", "Incorrect password");
				RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
				dispatch.forward(request, response);
			}	
		}
	}
}