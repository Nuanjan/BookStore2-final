<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Update Book</title>
		<link rel="stylesheet" type="text/css" href="css/bookstyle.css">
	</head>
	<body>
		<h1 style="color:#def2f1; text-align: center;" > Update Book</h1>

		<form action="admin" method="post" style="color:#ffffff">
  			<input type="hidden" name="source" value="updatebook">	
  				<br>
  	 			Book ID:
				<br><input type="text" name="bookID"><br>
 	 			ISBN:
				<br><input type="text" name="ISBN"><br>
 	 			Author Name:
				<br><input type="text" name="authorName"><br>
				Year:
				<br><input type="text" name="year"><br>
				Editor:
				<br><input type="text" name="publisher"><br>
				title:
				<br><input type="text" name="title"><br>
 	 			price:
				<br><input type="text" name="price"><br>
				
				<button type="submit"style="display:block; margin:0 auto;">submit</button>
				<input type="hidden" name="source" value="bookManager">
		</form>
		<form action="admin" method="post">
  			<input type="hidden" name="source" value="bookManager">	
		<button type="submit"style="display:block; margin:0 auto;">Back to Book Manager</button>
		</form>
	</body>
</html>