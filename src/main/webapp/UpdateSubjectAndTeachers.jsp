<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Update Subject and Teacher</h1> 

<form action="UpdateSubject_Teacher" method="post">
S.No<input type="text" name="id" required> <br> <br>
Subject Name
<select name="subject">
<option>BSC</option>
<option>BCA</option>
<option>BCOM</option>
<option>JAVA</option>
<option>LINUX</option>
<option></option>
</select><br> <br>

Teacher Name
<select name="teacher">
<option>Vikram</option>
<option>Partho</option>
<option>Tamil</option>
<option>Mohan</option>
<option>Sohan</option>

</select>
 <br> <br>
<input type="submit">
</form>
</center>
</body>
</html>