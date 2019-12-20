<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Book List</title>
		<link rel="stylesheet" type="text/css" href="css/bookCatalog.css">
	</head>
	<body>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="remove">
			<input type="hidden" name="customer" value="${customer}">
			<input type="hidden" name="books" value="${books}">
			<input type="hidden" name="cart" value="${cart}">
			<div id="clear">
				<button type="submit">Clear cart</button>
			</div>
		</form>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="showcart">
			<input type="hidden" name="customer" value="${customer}">
			<input type="hidden" name="books" value="${books}">
			<input type="hidden" name="cart" value="${cart}">
			<div id = "button">
				<button type="submit">Show cart</button>
			</div>
		</form>
		<form action="cart" method="post">
			<input type="hidden" name="source" value="logoutMain">
			<div id = "button">
				<button type="submit" class="btn btn-primary btn-block">Log Out</button>
			</div>
		</form>
		<hr />
		<!-- Display Customer -->
		<div id="customerlist" class="customerlist_format">
		<h1 align="center" style="color: white">Book Shelf</h1>
			<c:forEach items="${books}" var="book">
				<br />
				
<ul class="products" >
    <li>
        
        <a href="#" style="color:#2b2d2f">    
 				${book.getTitle()}
 				<br/>
 				${book.getPrice()}
 	</a>
    </li>
    </ul>
 				
				<form action="cart" method="post">
					<input type="hidden" name="source" value="add">
					<input type="hidden" name="customer" value="${customer}">
					<input type="hidden" name="bookID" value="${book.getBookID()}">
					<input type="hidden" name="books" value="${books}">
					<div id = "button">
						<button type="submit">Add To Cart</button>
					</div>
				</form>
			</c:forEach>
		</div>
	</body>
</html>