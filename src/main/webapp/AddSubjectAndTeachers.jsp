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
<h1>Add Subject and Teacher</h1> 

<form action="subject_teacher" method="post">
S.No<input type="text" name="sno" required> <br> <br>
Subject Name
<select name="subject">
<option>BSC</option>
<option>BCA</option>
<option>BCOM</option>
<option>JAVA</option>
<option>BSc.cs</option>
<option>BBA</option>
<option>BA</option>
</select><br> <br>

Teacher Name
<select name="teachername">
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