package com.hiber.appservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiber.models.Student;
import com.hiber.service.StudentService;

/**
 * Servlet implementation class ModifyStudentServlet
 */
@WebServlet("/ModifyStudentServlet")
public class ModifyStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ModifyStudentServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int sid = Integer.parseInt(request.getParameter("txtSid"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");

        // Update the student details
        StudentService studentService = new StudentService();
        Student student = studentService.SearchStudent(sid);
        student.setName(name);
        student.setGender(gender);
        student.setFatherName(fatherName);
        student.setMotherName(motherName);
        student.setAddress(address);
        student.setPhoneNumber(phoneNumber);
        student.setEmailId(email);

        // Save the updated student details
        studentService.UpdateStudent(student);

        // Redirect to a success page or show a success message
        response.sendRedirect("ShowStudent.jsp");
	}

}
