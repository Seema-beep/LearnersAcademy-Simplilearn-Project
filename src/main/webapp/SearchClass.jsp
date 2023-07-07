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


	<h1 style="text-align: center; width: 100%">Search Class
		Details</h1>
	<form method="POST" action="SearchClass.jsp">
		<p style="text-align: center; width: 100%">
			<input type="text" name="txtCid" placeholder="Enter Class ID"
				required /> <br />
			<br /> <input type="submit" value="Click Me" />
		</p>
	</form>
	<%
	try {
		String cid = request.getParameter("txtCid");

		int cno = Integer.parseInt(cid);

		ClassService cs = new ClassService();
		ClassDetails cldetails = cs.SearchClass(cno);

		if (cldetails != null) {
	%>
	<table width="100%" border="1">
		<tr>
			<th>Class ID</th>
			<th>Class Name</th>
			
		</tr>
		<tr>
			<td><%=cldetails.getCid() %></td>
			<td><%=cldetails.getClassName()%></td>
			
		</tr>
		<%
		} else {
		out.print("<h1>Class Not Found</h1>");
		}
		} catch (Exception ex) {
		}
		%>
	</table>
</body>
</html>