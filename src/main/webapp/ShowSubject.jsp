<%@page import="java.util.List"%>
<%@page import="com.hiber.models.SubjectEntity"%>
<%@page import="com.hiber.service.SubjectService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center; width: 100%">All Subject</h1>
		
	<hr />
	<table width="100%" border="1">
		<tr>
			<th>Subject ID</th>
			<th>Subject Name</th>
			
		</tr>
		<%
		SubjectService cs = new SubjectService();
		List<SubjectEntity> suball = cs.ShowAllSubjects();
		for (SubjectEntity se : suball) {
		%>
		<tr>
			<td><%=se.getSu_id() %></td>
			<td><%=se.getName()%></td>
			
			
			<td>
			<a href="DeleteSubject.jsp?subno=<%=se.getSu_id()%>">Delete</a>
				&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
				
			
			</tr>
		<%
		}
		%>
	</table>

</body>
</html>