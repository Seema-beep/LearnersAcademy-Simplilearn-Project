<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Master Page</title>
<style>
body {
	background-color: #f8f9fa;
}

h1 {
	text-align: center;
	color: #FF1493;
	font-size: 32px;
}

.navigation-table {
	margin: 0 auto;
}

.navigation-table td {
	text-align: center;
	padding: 10px;
}

.navigation-links {
	color: #0000FF;
	text-decoration: none;
	font-size: 18px;
}
</style>
</head>
<body>

	<h1>Master Page</h1>
	<table class="navigation-table">
		<tr>
			<td><a href="TeacherLink.jsp" class="navigation-links">Teacher</a>
			</td>

		</tr>
		<tr>
			<td><a href="StudentLink.jsp" class="navigation-links">Students</a>
			</td>

		</tr>
		<tr>
			<td><a href="ClassLink.jsp" class="navigation-links">Classes</a>
			</td>

		</tr>
		<tr>
			<td><a href="SubjectLink.jsp" class="navigation-links">
					Subjects</a></td>

		</tr>
		<tr>
			<td colspan="2"><a href="Logout.jsp" class="navigation-links">Logout</a>
			</td>
		</tr>
	</table>

</body>
</html>
