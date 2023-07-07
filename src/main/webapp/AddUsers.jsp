<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>

    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/css/bootstrap.min.css">

    <!-- Include your custom CSS -->
    <style>
        /* Custom CSS styles */
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ffffff;
            border: 1px solid #ced4da;
            border-radius: 5px;
        }

        h1 {
            text-align: center;
        }

        form {
            text-align: center;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ced4da;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>New User Details</h1>
    <form method="POST" action="AddUser">
        <input type="text" name="txtUname" placeholder="Enter User Name" required /><br /><br />
        <input type="text" name="txtPwd" placeholder="Enter Password" required /><br /><br />
        <input type="text" name="txtPname" placeholder="Enter Person Name" required /><br /><br />
        <input type="submit" value="Add User" />
    </form>
</div>

<!-- Include Bootstrap JS files if needed -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/js/bootstrap.min.js"></script>

</body>
</html>
