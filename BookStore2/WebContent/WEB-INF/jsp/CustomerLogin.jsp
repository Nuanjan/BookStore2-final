<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/userLogin.css">
</head>
<body>
<form action = "LoginCustomerServlet" medthod="post">

<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>wel<span>come Customer</span></div>
		</div>
		<br>
		<div class="login">
				<input type="text" placeholder="email" name="email"><br>
				<input type="password" placeholder="password" name="password"><br>
				<input type="submit" value="Login">
		</div>
		</form>
</body>
</html>