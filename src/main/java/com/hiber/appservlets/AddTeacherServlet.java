package com.hiber.appservlets;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiber.models.Teacher;

import com.hiber.service.TeacherService;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet("/AddTeacherServlet")
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
        String qualification = request.getParameter("qualification");
        String specialization = request.getParameter("specialization");
        String dateOfJoiningString = request.getParameter("dateOfJoining");
        String designation = request.getParameter("designation");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        
        // Convert the date string to a Date object
        Date dateOfJoining = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateOfJoining = dateFormat.parse(dateOfJoiningString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Create a new Teacher object
        Teacher teacher = new Teacher();
        TeacherService ts = new TeacherService();
        teacher.setName(name);
        teacher.setQualification(qualification);
        teacher.setSpecialization(specialization);
        teacher.setDateOfJoining(dateOfJoining);
        teacher.setDesignation(designation);
        teacher.setAddress(address);
        teacher.setPhoneNumber(phoneNumber);
        teacher.setEmail(email);
        
        // Save the teacher object using the TeacherService
        ts.AddNewTeacher(teacher);
        
        
        response.sendRedirect("ShowTeacher.jsp");
    } 
		
	}

