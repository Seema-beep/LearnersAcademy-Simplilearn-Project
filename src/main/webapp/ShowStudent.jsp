<%@page import="com.hiber.models.Student"%>
<%@page import="com.hiber.service.StudentService"%>
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

	<h1 style="text-align: center; width: 100%">All Students
		Information</h1>
	<hr />
	<table width="100%" border="1">
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Father Name</th>
			<th>Mother Name</th>
			<th>Address</th>
			<th>Phone Number</th>
			<th>Email</th>


		</tr>
		<%
		StudentService ss = new StudentService();
		List<Student> studentall = ss.ShowAllStudent();
		for (Student st : studentall) {
		%>
		<tr>
			<td><%=st.getSid()%></td>
			<td><%=st.getName()%></td>
			<td><%=st.getGender()%></td>
			<td><%=st.getFatherName()%></td>
			<td><%=st.getMotherName()%></td>
			<td><%=st.getAddress()%></td>
			<td><%=st.getPhoneNumber()%></td>
			<td><%=st.getEmailId()%></td>
			
			<td>
			<a href="DeleteStudent.jsp?sno=<%=st.getSid()%>">Delete</a>
				&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
				<a
				href="UpdateStudent.jsp?sno=<%=st.getSid()%>">Modify</a></td>


		</tr>
		<%
		}
		%>
	</table>

</body>
</html>