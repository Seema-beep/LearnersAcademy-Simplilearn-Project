<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Add Student</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	background-color: lightblue;
}

.container {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

form {
	width: 500px;
	padding: 20px;
	border-radius: 5px;
	background-color: white;
}

.form-group label {
	font-weight: bold;
}

.form-group input[type="text"], .form-group input[type="date"],
	.form-group input[type="email"] {
	width: 100%;
	max-width: 300px; /* Decreased width */
	padding: 8px;
	border: 1px solid lightgray;
	border-radius: 5px;
	margin-bottom: 10px;
}

.form-group input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: violet;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</head>

<body>
	<div class="container">
		<h1 class="text-center mb-4">Add Student</h1>
		<form action="AddStudentServlet" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" id="name"
					name="name" required>
			</div>

			<div class="form-group">
				<label for="gender">Gender:</label> <input type="radio" id="male"
					name="gender" value="male" required> <label for="male">Male</label>
				<input type="radio" id="female" name="gender" value="female"
					required> <label for="female">Female</label>
			</div>

			<div class="form-group">
				<label for="fatherName">Father's Name:</label> <input type="text"
					id="fatherName" name="fatherName" required>
			</div>

			<div class="form-group">
				<label for="motherName">Mother's Name:</label> <input type="text"
					id="motherName" name="motherName" required>
			</div>

			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address" required>
			</div>



			<div class="form-group">
				<label for="phoneNumber">Phone Number:</label> <input type="text"
					id="phoneNumber" name="phoneNumber" required>
			</div>

			<div class="form-group">
				<label for="emailId">Email:</label> <input type="email" id="emailId"
					name="emailId" required>
			</div>

			<div class="form-group text-center">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>

</html>
