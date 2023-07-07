<%
session.invalidate();  // it will delete all session variables
response.sendRedirect("Login.jsp");
%>