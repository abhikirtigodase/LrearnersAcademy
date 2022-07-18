<%@page import="com.abhi.dao.TeacherDAO"%>
<%@page import="com.abhi.pojo1.*" %>
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
<h1>Details of all Teachers</h1>
<%
TeacherDAO dao=new TeacherDAO();
List<Teacher> list=dao.getallTeacher();
%>
<table border="1"> 
<tr><th>Teacher id</th><th>First Name</th><th>Last Name</th><th>DOB</th><th>Address</th><th>Contact</th><th>Designation</th><th>Edit</th><th><a hre="delete.jsp">Delete</a></th></tr>
<%for(Teacher ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getFname() %></td><td><%=ss.getLname() %></td><td><%=ss.getDate() %></td><td><%=ss.getAddress() %></td><td><%=ss.getPhoneno() %></td><td><%=ss.getDesignation() %></td><td><a href="Update_Teacher.jsp">edit</</a></td><td><a href="deleteteacher.jsp">delete</a></td></tr>
<%}%>
</table>

<form>
<a href="Add_Teachers.jsp">Add New Teacher </a>
</form>


</body>
</html>