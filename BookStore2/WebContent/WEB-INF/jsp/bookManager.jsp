<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bookManager.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="admin" method="post">
		<input type="hidden" name="source" value="addbook">
		<div id="bookregister">
			<button type="submit" class="btn btn-primary btn-block">add book</button>
		</div>
	</form>
	<form action="admin" method="post">
		<input type="hidden" name="source" value="updatebook">
		<div id="bookupdate">
			<button type="submit" class="btn btn-primary btn-block">update book</button>
		</div>
	</form>
	<form action="admin" method="post">
		<input type="hidden" name="source" value="deletebook">
		<div id="bookdelete">
			<button type="submit" class="btn btn-primary btn-block">delete book</button>
		</div>
	</form>
	<form action="admin" method="post">
		<input type="hidden" name="source" value="booklist">
		<div id="bookdelete">
			<button type="submit" class="btn btn-primary btn-block">Show Book List</button>
		</div>
	</form>
	<form action="admin" method="post">
			<input type="hidden" name="source" value="logout">
			<div id = "button">
				<button type="submit" class="btn btn-primary btn-block">Log Out</button>
			</div>
		</form>
</body>
</html>