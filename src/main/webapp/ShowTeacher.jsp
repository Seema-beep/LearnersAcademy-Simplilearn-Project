<%@page import="com.hiber.models.Teacher"%>
<%@page import="com.hiber.service.TeacherService"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align: center; width: 100%">All Teachers
		Information</h1>
	<hr />
	<table width="100%" border="1">
		<tr>
			<th>Teacher ID</th>
			<th>Qualification</th>
			<th>Specialization</th>
			<th>Date of Joining</th>
			<th>Designation</th>
			<th>Address</th>
			<th>PhoneNo</th>
			<th>Email</th>


		</tr>
		<%
		TeacherService ts = new TeacherService();
		List<Teacher> teachall = ts.ShowAllTeacher();
		for (Teacher t : teachall) {
		%>
		<tr>
			<td><%=t.getTid()%></td>
			<td><%=t.getName()%></td>
			<td><%=t.getSpecialization()%></td>
			<td><%=t.getDateOfJoining()%></td>
			<td><%=t.getDesignation()%></td>
			<td><%=t.getAddress()%></td>
			<td><%=t.getPhoneNumber()%></td>
			<td><%=t.getEmail()%></td>
			
			<td>
			<a href="DeleteTeacher.jsp?tno=<%=t.getTid()%>">Delete</a>
				&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
				<a
				href="UpdateTeacher.jsp?tno=<%=t.getTid()%>">Modify</a></td>


		</tr>
		<%
		}
		%>
	</table>

</body>
</html>