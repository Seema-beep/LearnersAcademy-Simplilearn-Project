package com.hiber.appservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiber.models.Users;
import com.hiber.service.UserService;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddUser() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("txtUname");
		String pwd = request.getParameter("txtPwd");
		String pname = request.getParameter("txtPname");
		
		UserService us = new UserService();
		Users user = new Users();
		
		user.setUsername(uname);
		user.setPassword(pwd);
		user.setPersonname(pname);
		
		us.AddNewUser(user);
		response.sendRedirect("AddUsers.jsp");
		
		
		
		
	}

}
