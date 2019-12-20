<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
    <center>
        <h1>Book List</h1>
    </center>
    <div align="center">
    <form action="admin" method="post">
    <input type="hidden" name="source" value="booklist">	
        <table border="1" cellpadding="5">
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>Book ID</th>
                <th>ISBN</th>
                <th>Author Name</th>
                <th>Year</th>
                <th>Publisher</th>
                <th>Title</th>
                <th>Price</th>
                
            </tr>
            <c:forEach var="books" items="${booklist}">
                <tr>
                    <td><c:out value="${books.bookID}" /></td>
                    <td><c:out value="${books.ISBN}" /></td>
                    <td><c:out value="${books.authorName}" /></td>
                    <td><c:out value="${books.year}" /></td>
                    <td><c:out value="${books.publisher}" /></td>
                    <td><c:out value="${books.title}" /></td>
                    <td><c:out value="${books.price}" /></td>

                </tr>
            </c:forEach>
        </table>
        </form>
        <form action="admin" method="post">
  			<input type="hidden" name="source" value="bookManager">	
  			<button type="submit"style="display:block; margin:0 auto;">back to Manager</button>
  			</form>
    </div>   
</body>
</html>