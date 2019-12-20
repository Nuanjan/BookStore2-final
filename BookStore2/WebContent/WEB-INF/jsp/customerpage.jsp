<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/customerpage.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student</title>
</head>
<body>
<div class="wrapper">
	<form action="customer" method="post">
		<input type="hidden" name="source" value="bookslist">
		<div id="bookslist">
			<button type="submit" class="btn btn-primary btn-block">List books</button>
		</div>
	</form>
	<form action="customer" method="post">
		<input type="hidden" name="source" value="logout">
		<div id="logout">
			<button type="submit" class="btn btn-primary btn-block">Log out</button>
		</div>
	</form>
	</div>
</body>
</html>