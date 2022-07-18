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
<tr><th>Studentid</th><th>First Name</th><th>Last Name</th><th>DOB</th><th>Address</th><th>Contact</th><th>Class</th><th>Edit</th><th><a hre="delete.jsp">Delete</a></th></tr>

<%for(Student ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getFname() %></td><td><%=ss.getLname() %></td><td><%=ss.getDate() %></td><td><%=ss.getAddress() %></td><td><%=ss.getPhoneno() %></td><td><%=ss.getSelect1() %></td><td><a href="UpdateStudent.jsp">edit</</a></td><td><a href="deletestudent.jsp">delete</a></td></tr>
<%}%>

</table>

<form>
<a href="AddStudents.jsp"> Add New Student </a>
</form>


</body>
</html>