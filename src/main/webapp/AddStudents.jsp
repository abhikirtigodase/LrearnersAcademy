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
<h1>Add Students</h1>
<form action="Insertstudent" method="post">
Enter ID<input type="text" name="id" required> <br> <br>
First Name<input type="text" name="fname" required> <br> <br>
Last Name<input type="text" name="lname" required> <br> <br>
DOB<input type="date" name="date" required> <br> <br>
Address<input type="text" name="address" required> <br> <br>
Phone No<input type="text" name="phoneno" required> <br> <br>
Choose Subject<select name="select1" required>
<option>BCA</option>
<option>BBA</option>
<option>BCOM</option>
<option>BSC</option>
<option>BTECH</option>
<option>MBA</option>

 </select>
<br> <br>
 <input type="submit" value="Add Student">
</form>
</center>
</body>
</html>