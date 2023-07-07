<%@page import="com.hiber.models.Teacher"%>
<%@page import="com.hiber.service.TeacherService"%>

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
	<jsp:include page="Links.jsp" />


	<h1 style="text-align: center; width: 100%">Search Teacher Details</h1>
	<form method="POST" action="SearchTeacher.jsp">
		<p style="text-align: center; width: 100%">
			<input type="text" name="txtTid" placeholder="Enter Teacher ID"
				required /> <br /> <br /> <input type="submit"
				value="Search Teacher" />
		</p>
	</form>
	<%
	try {
		String tid = request.getParameter("txtTid");

		int tno = Integer.parseInt(tid);

		TeacherService ts = new TeacherService();
		Teacher tdetails = ts.SearchTeacher(tno);

		if (tdetails != null) {
	%>
	<table width="100%" border="1">
		<tr>
			<th>Teacher ID</th>
			<th>Name</th>
			<th>Qualification</th>
			<th>Specialization</th>

			<th>Date of Joining</th>
			<th>Designation</th>
			<th>PhoneNumber</th>
			<th>Address</th>
			

			<th>Email</th>
			
		
			
		</tr>
		<tr>
			<td><%=tdetails.getTid()%></td>
			<td><%=tdetails.getName()%></td>
			<td><%=tdetails.getQualification()%></td>
			<td><%=tdetails.getSpecialization()%></td>
			<td><%=tdetails.getDateOfJoining()%></td>
			<td><%=tdetails.getDesignation()%></td>
			<td><%=tdetails.getAddress()%></td>
			<td><%=tdetails.getPhoneNumber()%></td>
			<td><%=tdetails.getEmail()%></td>
			
			
		</tr>
		<%
		} else {
		out.print("<h1>Teacher Not Found</h1>");
		}
		} catch (Exception ex) {
		}
		%>
	</table>
</body>
</html>