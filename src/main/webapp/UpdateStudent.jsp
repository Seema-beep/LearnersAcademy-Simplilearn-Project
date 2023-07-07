<%@page import="com.hiber.service.StudentService"%>
<%@page import="com.hiber.models.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 style="text-align: center; width: 100%">Update Student Details</h1>
	<form method="POST" action="ModifyStudentServlet">
		<p style="text-align: center; width: 100%">
			<%
			String stuid = request.getParameter("sno");

			int sno = Integer.parseInt(stuid);

			StudentService st = new StudentService();
			Student studetails = st.SearchStudent(sno);

			
			%>
			<input type="text" name="txtSid" value='<%=studetails.getSid()%>'
				readonly /> <br /> <br /> <input type="text" id="name"
				name="name" value='<%=studetails.getName()%>' required> <br />
			<br />
			




			<label for="gender">Gender:</label> <input type="radio" id="male"
				name="gender" value="male"
				<%if (studetails.getGender().equals("male"))
	out.print("checked");%>
				required> <label for="male">Male</label> <input type="radio"
				id="female" name="gender" value="female"
				<%if (studetails.getGender().equals("female"))
	out.print("checked");%>
				required> <label for="female">Female</label> 
				<br/>
				<br/>
				<input
				type="text" id="fatherName" name="fatherName"
				value='<%=studetails.getFatherName()%>' required><br /> <br />

			<input type="text" id="motherName" name="motherName"
				value='<%=studetails.getMotherName()%>' required><br /> <br />



			<input type="text" id="address" name="address"
				value='<%=studetails.getAddress()%>' required><br /> <br />

			<input type="text" id="phoneNumber" name="phoneNumber"
				value='<%=studetails.getPhoneNumber()%>' required><br /> <br />
			<input type="email" id="email" name="email"
				value='<%=studetails.getEmailId()%>' required><br /> 
				<br/>
				<input
				type="submit" value="UpdateStudent" /> <br /> <br /> <a
				href="ShowStudent.jsp">Back</a>
		</p>

	</form>

</body>
</html>