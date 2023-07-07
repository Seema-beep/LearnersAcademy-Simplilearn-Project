<%@page import="com.hiber.models.SubjectEntity"%>
<%@page import="com.hiber.service.SubjectService"%>
<%@page import="com.hiber.models.ClassDetails"%>
<%@page import="com.hiber.service.ClassService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Both designing and function on the same page -->


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="Links.jsp"/> 


	<h1 style="text-align: center; width: 100%">Search Subject
		Details</h1>
	<form method="POST" action="SearchSubject.jsp">
		<p style="text-align: center; width: 100%">
			<input type="text" name="txtSubid" placeholder="Enter Subject ID"
				required /> <br />
			<br /> <input type="submit" value="Search" />
		</p>
	</form>
	<%
	try {
		String sub_id = request.getParameter("txtSubid");

		int sno = Integer.parseInt(sub_id);

		SubjectService ss = new SubjectService();
		SubjectEntity se = ss.SearchSubject(sno);

		if (se != null) {
	%>
	<table width="100%" border="1">
		<tr>
			<th>Subject ID</th>
			<th>Subject Name</th>
			
		</tr>
		<tr>
			<td><%=se.getSu_id() %></td>
			<td><%=se.getName()%></td>
			
		</tr>
		<%
		} else {
		out.print("<h1>Subject Not Found</h1>");
		}
		} catch (Exception ex) {
		}
		%>
	</table>
</body>
</html>