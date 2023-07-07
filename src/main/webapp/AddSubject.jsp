
<%@page import="com.hiber.models.SubjectEntity"%>
<%@page import="java.util.List"%>
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



	<h1 style="text-align: center; width: 100%"> Subject Details</h1>
	<hr />


	<!-- First part coding -->
	<form method="POST" action="AddSubjectServlet">
		<p style="text-align: center; width: 100%">
			<input type="text" name="txtSubname" placeholder="Enter Subject Name"
				required /> <br />
			<br /> <input type="submit" value="Add Subject" />
		</p>
	</form>
	<hr />

	<!-- Second part coding -->
	<!-- To display the entered values on the same page we have to write the below coding -->
	


</body>
</html>