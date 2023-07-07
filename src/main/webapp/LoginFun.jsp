<%@page import="com.hiber.models.Users"%>
<%@page import="com.hiber.service.UserService"%>

<%
String uname = request.getParameter("txtUname");
String pwd = request.getParameter("txtPwd");

if (uname != null && pwd != null) {
    UserService us = new UserService();
    Users uinfo = us.CheckUsers(uname, pwd);

    if (uname.equals("seemabhuyan2020@gmail.com") && pwd.equals("p@123")) {
        session.setAttribute("pname", uinfo.getPersonname());
        RequestDispatcher rd = request.getRequestDispatcher("MasterPage.jsp");
        rd.forward(request, response);
    } else {
        out.print("<h2 style='text-align:center;color:red'>Please check username/password</h2>");
        RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
        rd.include(request, response);
    }
} else {
    out.print("<h2 style='text-align:center;color:red'>Please enter all credentials</h2>");
    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
    rd.include(request, response);
}
%>
