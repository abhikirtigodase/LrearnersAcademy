<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.abhi.dao.*" %>
    <%@ page import="com.abhi.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
<style>
.c1{text-align:center; position:absolute; font-size:30px; color:purple; left:35%;}
.c2{color:Green; font-size:50px;}
</style>
</head>
<body bgcolor="#F7C0AE">

<center>
<%
Student s=new Student();
s.setId(request.getParameter("id"));
s.setFname(request.getParameter("name"));
s.setEmail(request.getParameter("email"));
StudentDAO dao=new StudentDAO();
int row=dao.insertstudent(s);
if(row>0){
	out.print("Insertion is successfull");
}
else{
	out.print("Insertion failed");
}
%>


<div class="c1">
<br> <br>
<a href="index.jsp">Insert more record</a> 

<form action="retrieve.jsp">  

<br> <br>

<input type="submit" value="getstudents" style="font-size:30px; color:blue; width:450px;">
</form>
</div>
</center>
</body>
</html>