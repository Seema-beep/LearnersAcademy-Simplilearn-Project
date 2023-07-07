<%@page import="com.hiber.models.ClassDetails"%>

<%@page import="com.hiber.service.ClassService"%>
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




<hr />
<jsp:include page="Links.jsp"/>
<hr />
<h1 style="text-align:center;width:100%">
Select Class</h1>
<form method="POST" action="ClassSubject.jsp">
<p style="text-align:center;width:100%">
<select name="ddlClass" style="width:150px">
	<option value="-1">Select Class</option>
	<%
	ClassService cs = new ClassService();
	List<ClassDetails> clAll = cs.ShowAllClasses();
	for(ClassDetails cd : clAll)
	{
	%>
		<option value='<%=cd.getCid() %>'>
				<%=cd.getClassName() %> 
		</option>
	<%
	}
	%>
</select>
<br /><br />
<input type="submit"  value="View Subjects" />
</p>
</form>
<hr />

<%
try
{
	String clno = request.getParameter("ddlClass");
	int c_no = Integer.parseInt(clno);
	
	SubjectService es  = new SubjectService();
	List<SubjectEntity> sall = es.ShowAllSubsBasedOnClass(c_no);
	if(!sall.isEmpty())
	{
	%>
	<table width="100%" border="1">
	<tr>
		<th>SubNo</th>
		<th>Subject Name</th>
		
	</tr>
	<%
	for(SubjectEntity se: sall)	
	{	
	%>
		<tr>
			<td><%=se.getSu_id() %></td>
			<td><%=se.getName() %></td>
			
		</tr>
	<%
	}
	}
	else
		out.print("<h1>No Subjects exist</h1>");
}
catch(Exception ex)
{
	}
%>	
</table>
</body>
</html>