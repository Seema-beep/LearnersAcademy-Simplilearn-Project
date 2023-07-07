<%@page import="com.hiber.models.Teacher"%>
<%@page import="com.hiber.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 style="text-align: center; width: 100%">Update Teacher
		Details</h1>
	<form method="POST" action="ModifyTeacher">
		<p style="text-align: center; width: 100%">
<%
	
String tid = request.getParameter("tno");

int tno = Integer.parseInt(tid);

TeacherService ts = new TeacherService();
Teacher tdetails = ts.SearchTeacher(tno);
		
		

		
	%>
			<input type="text" name="txtTid" value='<%=tdetails.getTid()%>'
				readonly /> <br />
			<br /> 
				<input type="text" id="name" name="name" value='<%=tdetails.getName()%>' required> <br />
			<br /> 
			 <input type="text" id="qualification" name="qualification" value='<%=tdetails.getQualification()%>'required> <br />
			<br /> 
			 <input type="text" id="specialization" name="specialization"  value='<%=tdetails.getSpecialization()%>'required><br /> 
			 
			 <br />
			 
			 <input type="date" id="dateOfJoining" name="dateOfJoining" value='<%=tdetails.getDesignation()%>'required><br/>
			<br />
			
			<input type="text" id="designation" name="designation" required><br/>
			<br/>
			
			<input type="text" id="address" name="address" required><br/>
			<br/>
			
			<input type="text" id="phoneNumber" name="phoneNumber" value='<%=tdetails.getAddress()%>' required><br/>
			<br/>
		    <input type="email" id="email" name="email" value='<%=tdetails.getEmail()%>' required><br/>
			 <input type="submit" value="UpdateTeacher" /> <br />
			<br /> <a href="ShowTeacher.jsp">Back</a>
		</p>
	</form>

</body>
</html>