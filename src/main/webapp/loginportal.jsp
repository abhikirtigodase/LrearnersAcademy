<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<center>
<h1>WelCome To Learners Academy</h1>
<form action="LoginPortalServlet" method="post">

Username <input type="text" name="user" required> <br> <br>
Password <input type="text" name="password" required> <br> <br>

<input type="submit" value="Login">

</form>
</center>
</body>
</html>