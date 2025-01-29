<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
<link rel= "stylesheet" type = "text/css" href="styles.css">
</head>
<body background = "copy-2518265_1280.jpg">
<form action="loginservlet" method="post">
<div class="imgcontainer">
<img src="Avatar.png" alt="Avatar" class="avatar">  </div>
<div class= "container">
<label for="username"><b>UserName:</b></label>
<input type="text" name="uname" placeholder="Enter user name" required>
<label for= "password"><b>Password:</b></label>
<input type="password" name="pwd" placeholder="Enter passsword" required>
<button type="submit">Login</button><br>
<a href= "">If you are new user? create account</a>
</div>
</form>
</body>
</html>

