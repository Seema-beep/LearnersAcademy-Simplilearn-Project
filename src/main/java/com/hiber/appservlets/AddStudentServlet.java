package com.hiber.appservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiber.models.Student;
import com.hiber.models.Teacher;
import com.hiber.service.StudentService;
import com.hiber.service.TeacherService;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
            // Retrieve the form data
            String sidString = request.getParameter("sid");
           // String cidString = request.getParameter("cid");
            int sid = 0;
           // int cid = 0;

            // Validate and parse the input for sid
            if (sidString != null && !sidString.isEmpty()) {
                sid = Integer.parseInt(sidString);
            }

            // Validate and parse the input for cid
       /*     if (cidString != null && !cidString.isEmpty()) {
                cid = Integer.parseInt(cidString);
            }*/

            // Retrieve the other form data
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String fatherName = request.getParameter("fatherName");
            String motherName = request.getParameter("motherName");
            String address = request.getParameter("address");
            String phoneNumber = request.getParameter("phoneNumber");
            String emailId = request.getParameter("emailId");

            // Create a new Student object
            Student student = new Student();
            student.setSid(sid);
          
            student.setName(name);
            student.setGender(gender);
            student.setFatherName(fatherName);
            student.setMotherName(motherName);
            student.setAddress(address);
            student.setPhoneNumber(phoneNumber);
            student.setEmailId(emailId);
            
            StudentService ss = new StudentService();
    	    ss.AddNewStudent(student);

            // Perform the necessary operations with the student object (e.g., save it in the database)

            // Redirect back to the student.jsp page
            response.sendRedirect("ShowStudent.jsp");
        } catch (NumberFormatException e) {
            // Handle the exception appropriately (e.g., display an error message)
            e.printStackTrace();
        }
    }

}







