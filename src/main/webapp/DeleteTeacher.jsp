

<%@page import="com.hiber.models.Teacher"%>
<%@page import="com.hiber.service.TeacherService"%>
<%
	
String tid = request.getParameter("tno");

int tno = Integer.parseInt(tid);

TeacherService ts = new TeacherService();
ts.DeleteTeacher(tno);
response.sendRedirect("ShowTeacher.jsp");

%>