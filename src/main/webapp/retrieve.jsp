<%@page import="com.abhi.dao.StudentDAO"%>
<%@page import="com.abhi.pojo.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve</title>
</head>
<body>
<h1>Details of all students</h1>
<%
StudentDAO dao=new StudentDAO();
List<Student> list=dao.getallstudents();
%>
<table border="1"> 
<tr><th>Studentid</th><th>Studentname</th><th>Studentemail</th><th>Edit</th><th><a hre="delete.jsp">Delete</a></th></tr>
<%for(Student ss:list){ %>
<tr><td><%=ss.getId() %></td>
<td><%=ss.getFname() %></td>

<td><%=ss.getFname() %></td>
<td><%=ss.getFname() %></td>
<td><%=ss.getFname() %></td>>
<td><a href="updateJSP.jsp">edit</</a></td>
<td><a href="delete.jsp">delete</a></td></tr>
<%}%>
</table>


</body>
</html>