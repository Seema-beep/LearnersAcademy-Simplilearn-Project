<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 100px;
        }
        h1 {
            text-align: center;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .login-button {
            background-color: #0000FF;
            color: #FFFFFF;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Admin Login</h1>
    <form method="POST" action="LoginFun.jsp">
        <div class="form-group">
            <input type="text" class="form-control" name="txtUname" placeholder="Enter User Name" required />
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="txtPwd" placeholder="Enter Password" required />
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block login-button">Login</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>
