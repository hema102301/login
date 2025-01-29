<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
table td{
color:white;

}
#user{
text-align : center;
}
.center{
margin-left: auto;
margin-right: auto;
}

</style>
</head>
<body background ="ocean-3605547_1280.jpg">
 <div>
<%
	String userAddMsg= (String)request.getAttribute("useradded");
	if(null!=userAddMsg){
 %>
	<%= userAddMsg %>
<%} %>
</div> 
<form action="registerservlet" method="post" id= "user">
<h3 style = "color:DeepPink">  Enter login details</h3>
<table class="center" >
<tr>
<td>UserName:</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email"  name="email"></td>
</tr>
<tr>
<td>phonenum:</td>
<td><input type="text"  name="phonenum"></td>
</tr>
</table><br>
<input type="Submit" value="Register">
</form>
</body>
</html>