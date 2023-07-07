package com.hiber.appservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiber.models.ClassDetails;
import com.hiber.models.Teacher;
import com.hiber.service.ClassService;
import com.hiber.service.TeacherService;

/**
 * Servlet implementation class AddClassServlet
 */
@WebServlet("/AddClassServlet")
public class AddClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Retrieve form data
        String className = request.getParameter("txtClname");

        // Create a new Classes object
        ClassService cs = new ClassService();
        ClassDetails cl = new ClassDetails();
        
        
        cl.setClassName(className);

        // Save the new class using the ClassService
       
        cs.AddNewClass(cl);
       

        // Redirect to the AddClass.jsp page to display the updated class list
        response.sendRedirect("ShowClass.jsp");
	}

}
