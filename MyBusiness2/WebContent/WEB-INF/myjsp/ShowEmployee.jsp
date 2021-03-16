<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Show Employee</title>
</head>
<body>
<h1> Show Employee</h1>
<p> The employee List as follows: </p>
<%
ArrayList al=(ArrayList)request.getAttribute("employeeList");
for (Object e:al){
	Employee ee=(Employee)e;
	out.println(ee.getEmployeeId()+"...."+ee.getEmployeeName()+"..."+ee.getDepartmentId()+"<br>");
}
%>
<a href="/MyBusiness2">Add Employee</a>
</body>
</html>
