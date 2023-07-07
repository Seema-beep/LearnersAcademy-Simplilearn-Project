
<%@page import="com.hiber.models.ClassDetails"%>
<%@page import="java.util.List"%>
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



	<h1 style="text-align: center; width: 100%">New Class Details</h1>
	<hr />


	<!-- First part coding -->
	<form method="POST" action="AddClassServlet">
		<p style="text-align: center; width: 100%">
			<input type="text" name="txtClname" placeholder="Enter Class Name"
				required /> <br />
			<br /> <input type="submit" value="Add Class" />
		</p>
	</form>
	<hr />

	<!-- Second part coding -->
	<!-- To display the entered values on the same page we have to write the below coding -->
	


</body>
</html>