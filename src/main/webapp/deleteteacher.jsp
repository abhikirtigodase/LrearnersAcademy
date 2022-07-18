

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body bgcolor="#F7C0AE">
<center>
<form action="DeleteTeacherServlet" method="post">
<h2>Enter ID For Delete</h2><input type="text" name="id" style="font-size:30px; color:blue; width:450px;" required> <br><br>
<input type="submit" value="Delete" style="font-size:30px; color:blue; width:450px;">
</form>
</center>
</body>
</html>