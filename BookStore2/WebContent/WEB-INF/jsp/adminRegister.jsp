<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/userstyle.css">
<meta charset="ISO-8859-1">
<title>User Register</title>
</head>
<body>
<div class="head">
<h1 style="color:white;"> Register Form</h>
</div>





<form action="RegisterAdminServlet" method="post" style="color:#ffffff">
<br style=“line-height:100;”>
 	 	First name:
<br><input type="text" name="firstname"><br>
 	 	Last name:
<br><input type="text" name="lastname"><br>
		Email:
<br><input type="text" name="email"><br>
		Password:
<br><input type="password" name="password"><br>
		Confirm Password:
<br><input type="password" name="confirmPassword"><br>
		Address1:
<br><input type="text" name="address1"><br>
		Address2:
<br><input type="text" name="address2"><br>
		Street:
<br><input type="text" name="street"><br>
 	 	City:
<br><input type="text" name="city"><br>
		
 	 	State:
<br><input type="text" name="state"><br>
		Zip code:
<br><input type="text" name="zipcode">
<br style=“line-height:100;”>
<p style="text-align:center;">
<input type="submit" value="register">
</p>
	</form>

<div style="text-align: center; margin-bottom: 20px;" >	
<a href="/webContent/AdminLogin.jsp">Already have an account?</a>
</div>
</body>
</html>