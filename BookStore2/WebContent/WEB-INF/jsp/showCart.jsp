<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Cart</title>
		<link rel="stylesheet" href="">
	</head>
	<body>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="clearCart">
			<input type="hidden" name="customer" value="${customer}">
			<input type="hidden" name="books" value="${books}">
			<input type="hidden" name="cart" value="${cart}">
			<div id="clear">
				<button type="submit" class="btn btn-primary btn-block">Clear cart</button>
			</div>
		</form>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="showBookList">
			<div id = "button">
				<button type="submit" class="btn btn-primary btn-block">Back to books list</button>
			</div>
		</form>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="logout">
			<div id = "button">
				<button type="submit" class="btn btn-primary btn-block">Log out</button>
			</div>
		</form>
		<hr />
		<!-- Display Books -->
		<div id="bookslist" class="bookslist_format">
			<c:forEach items="${bookscart}" var="book">
				<br />
 				${book.getTitle()}
 				${book.getPrice()}
 				<form action="cart" method="post">
					<input type="hidden" name="source" value="remove">
					<input type="hidden" name="customer" value="${customer}">
					<input type="hidden" name="book" value="${book}">
					<input type="hidden" name="books" value="${books}">
					<div id = "button">
	<button type="submit" class="btn btn-primary btn-block">remove</button>
					</div>
				</form>
			</c:forEach>
		</div>
	</body>
</html>