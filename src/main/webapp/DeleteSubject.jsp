
<%@page import="com.hiber.service.SubjectService"%>
<%@page import="com.hiber.service.StudentService"%>

<%
	
String sid = request.getParameter("subno");

int subno = Integer.parseInt(sid);

SubjectService ss = new SubjectService();
ss.DeleteSubject(subno);
response.sendRedirect("ShowSubject.jsp");

%>