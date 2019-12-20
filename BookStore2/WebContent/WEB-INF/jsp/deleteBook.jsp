<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/deleteBook.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="admin" method="post">
<input type="hidden" name="source" value="deletebook">	
Please Insert Book ID:
<br><input type="text" name="bookID"><br>
<button type="submit"style="display:block; margin:0 auto;">submit</button>
</form>
<form action="admin" method="post">	
				<input type="hidden" name="source" value="bookManager">	
				<button type="submit"style="display:block; margin:0 auto;">Back to Book Manager</button>
				</form>
</body>
</html>