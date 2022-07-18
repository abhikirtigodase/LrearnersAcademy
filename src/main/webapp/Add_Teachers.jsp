<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1></h1>
<center>
<h1>Add Teachers</h1>
<form action="InsertTeacher" method="post">
Enter ID <input type="text" name="id" required> <br> <br>
First Name <input type="text" name="fname" required> <br> <br>
Last Name <input type="text" name="lname" required> <br> <br>
DOB <input type="date" name="date" required> <br> <br>
Address <input type="text" name="address" required> <br> <br>
Phone No <input type="text" name="phoneno" required> <br> <br>
Designation <input type="text" name="designation" required> <br> <br>

<input type="submit" value="Add Teacher">

</form>
</center>
</body>
</html>