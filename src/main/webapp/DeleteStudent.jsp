<%@page import="com.hiber.models.Student"%>
<%@page import="com.hiber.service.StudentService"%>


<%
			String stuid = request.getParameter("sno");

			int sno = Integer.parseInt(stuid);

			StudentService st = new StudentService();
			st.DeleteStudent(sno);
			response.sendRedirect("ShowStudent.jsp");

			
			%>