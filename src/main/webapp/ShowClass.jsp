<%@page import="java.util.List"%>
<%@page import="com.hiber.models.ClassDetails"%>
<%@page import="com.hiber.service.ClassService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center; width: 100%">All Class
		Information</h1>
	<hr />
	<table width="100%" border="1">
		<tr>
			<th>Class ID</th>
			<th>Class Name</th>
			
		</tr>
		<%
		ClassService cs = new ClassService();
		List<ClassDetails> classall = cs.ShowAllClasses();
		for (ClassDetails c : classall) {
		%>
		<tr>
			<td><%=c.getCid() %></td>
			<td><%=c.getClassName()%></td>
			
			
			</tr>
		<%
		}
		%>
	</table>

</body>
</html>