<%@page import="com.abhi.dao.Subject_TeacherDAO"%>
<%@page import="com.abhi.pojo4.*" %>
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
<h1>List Of Classes</h1>
<%
Subject_TeacherDAO dao=new Subject_TeacherDAO();
List<Subject_Teacher> list=dao.getallsubject_teacher();
%>
<table border="1"> 
<tr><th>Id</th><th>Class Name</th><th>Edit</th><th><a hre="delete.jsp">Delete</a></th><th>Subject and Teachers</th><th>Reports</th></tr> 
<%for(Subject_Teacher ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getSubject() %></td><td><a href="UpdateSubjectAndTeachers.jsp">edit</</a></td><td><a href="deletesubjectandteacher.jsp">delete</a></td><td><a href="ShowSubject_Teacher.jsp">Subject and Teachers</a></td><td><a href="SubjectReport.jsp">Reports</a></td></tr>
<%}%>
</table>

<form>
<a href="AddSubjectAndTeachers.jsp">Add New Subject_Teacher </a>
</form>


</body>
</html>