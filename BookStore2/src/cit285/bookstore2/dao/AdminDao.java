package cit285.bookstore2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cit285.bookstore2.domain.*;


public class AdminDao {
	
	public void addBook(BookList books)
			throws SQLException, ClassNotFoundException {
		
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Create query
		String query1 = "insert into book (bookID,ISBN,authorName,year,publisher,title,price) " +
					   "values (?,?,?,?,?,?,?)";
		
		
		// Execute statement
		PreparedStatement preparedStatement = connection.prepareStatement(query1);
		
		preparedStatement.setInt(1, books.getBookID());
		preparedStatement.setString(2,books.getISBN());
		preparedStatement.setString(3,books.getAuthorName());
		preparedStatement.setInt(4,books.getYear());
		preparedStatement.setString(5,books.getPublisher());
		preparedStatement.setString(6,books.getTitle());
		preparedStatement.setDouble(7,books.getPrice());
		
		System.out.println("get book : "+books.getAuthorName());
		preparedStatement.executeUpdate();
		
		
		
	}
	
	public void updateBook(BookList books)
			throws SQLException, ClassNotFoundException {
		
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Create query
		String query = "update book SET book ISBN = ?,authorName =?,year =?,publisher =?,title =?,price =? where bookID = ?";
					  
		
		// Execute statement
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setInt(1, books.getBookID());
		preparedStatement.setString(2,books.getISBN());
		preparedStatement.setString(3,books.getAuthorName());
		preparedStatement.setInt(4,books.getYear());
		preparedStatement.setString(5,books.getPublisher());
		preparedStatement.setString(6,books.getTitle());
		preparedStatement.setDouble(7,books.getPrice());
		
		preparedStatement.executeUpdate();
	}
	
	public void deleteBook(BookList book) throws SQLException, ClassNotFoundException {
		
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Create query
		String query = "delete from book where bookID= ? ";
					  
		
		// Execute statement
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setInt(1, book.getBookID());
		
		
		preparedStatement.executeUpdate();
	}
	
	public ArrayList<RegisterAdmin> getAdminList()
			throws SQLException, ClassNotFoundException {
		
		ArrayList<RegisterAdmin> adminList = new ArrayList<>();
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Execute statement
		ResultSet resultSet = statement.executeQuery("select* from registeradmin");
		
		// Iterate through the result and print
		while(resultSet.next()) {
			RegisterAdmin admin = new RegisterAdmin();
			admin.setFirstName(resultSet.getString(1));
			admin.setLastName(resultSet.getString(2));;
			admin.setEmail(resultSet.getString(3));
			admin.setPassword(resultSet.getString(4));
			admin.setConfirmPass(resultSet.getString(5));
			admin.setAddress1(resultSet.getString(6));
			admin.setAddress2(resultSet.getString(7));
			admin.setStreet(resultSet.getString(8));
			admin.setCity(resultSet.getString(9));
			admin.setState(resultSet.getString(10));
			admin.setZipcode(resultSet.getInt(11));
			admin.setAdminID(resultSet.getInt(12));
			
			
			
			adminList.add(admin);
		}
		
	return adminList;
	}
	
	public ArrayList<BookList> getBookList()
			throws SQLException, ClassNotFoundException {
		
		ArrayList<BookList> booklist = new ArrayList<>();
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Execute statement
		ResultSet resultSet = statement.executeQuery("select* from book");
		BookList book = new BookList();
		// Iterate through the result and print
		while(resultSet.next()) {
			
			
			int bookID = resultSet.getInt("bookID");
			String ISBN = resultSet.getString("ISBN");
			String authorName =resultSet.getString("authorName");
			int year = resultSet.getInt("year");
			String publisher = resultSet.getString("publisher");
			String title = resultSet.getString("title");
			double price = resultSet.getDouble("price");
			
			book = new BookList(bookID,ISBN,authorName,year,publisher, title, price);
			booklist.add(book);
			
			
			
		}
		
	return booklist;
	}
	
	public BookList getBook(int bookID)  throws SQLException, ClassNotFoundException {
	    BookList book = null;
	    String sql = "SELECT * FROM book WHERE bookID = ?";
	     
	    Connection connection = getConnection();
	     
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	    preparedStatement.setInt(1, bookID);
	     
	    ResultSet resultSet = preparedStatement.executeQuery();
	     
	    if (resultSet.next()) {
	    	
			String ISBN = resultSet.getString("ISBN");
			String authorName =resultSet.getString("authorName");
			int year = resultSet.getInt("year");
			String publisher = resultSet.getString("publisher");
			String title = resultSet.getString("title");
			double price = resultSet.getDouble("price");
	         
	        book = new BookList(bookID,ISBN,authorName,year,publisher,title,price);
	    }
	     
	    resultSet.close();
	   preparedStatement.close();
	     
	    return book;
	}
	private Connection getConnection() 
			throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Connect to the database
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/bookstore","root","1510");
		
		
		
		return connection;
	}


}
