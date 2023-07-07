package com.hiber.appservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hiber.models.SubjectEntity;

import com.hiber.service.SubjectService;

/**
 * Servlet implementation class AddSubjectServlet
 */
@WebServlet("/AddSubjectServlet")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddSubjectServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// Retrieve form data
        String subName = request.getParameter("txtSubname");

        // Create a new Classes object
        SubjectService ss = new SubjectService();
        SubjectEntity se = new SubjectEntity();
        
        
        se.setName(subName);

        // Save the new class using the ClassService
       
        ss.AddNewSubject(se);
       

        // Redirect to the AddClass.jsp page to display the updated class list
        response.sendRedirect("ShowSubject.jsp");
	}

}
