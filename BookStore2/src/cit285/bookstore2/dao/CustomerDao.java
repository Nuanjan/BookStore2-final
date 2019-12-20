package cit285.bookstore2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cit285.bookstore2.domain.*;
public class CustomerDao {
	
	
	// Get a course given given the book Id.
	public BookList getBook(int bookID)
			throws SQLException, ClassNotFoundException {
		
			BookList book = new BookList();
			
			// Get Db connection
			Connection connection = getConnection();
			
			// Create statement
			Statement statement = connection.createStatement();
			
			// Create query
			String query = "select* from book where bookID = " + bookID;
			
			// Execute statement
			ResultSet resultSet = statement.executeQuery(query);
			
			// Iterate through the result and print
			if(resultSet.next()) {
				book.setBookID(resultSet.getInt(1));
				book.setISBN(resultSet.getString(2));
				book.setAuthorName(resultSet.getString(3));
				book.setYear(resultSet.getInt(4));
				book.setPublisher(resultSet.getString(5));
				book.setTitle(resultSet.getString(6));
				book.setPrice(resultSet.getDouble(7));
				
				System.out.println("bookID : " +book.getBookID());
			}
			else {
				// No student found for this studentID
				book = null;
			}
			
			// return the result
			return book;
	}
	
	// Get a list of courses
	public ArrayList<BookList> getBooksList()
			throws SQLException, ClassNotFoundException {
		
		ArrayList<BookList> booksList = new ArrayList<>();
		
		// Get Db connection
		Connection connection = getConnection();
		
		// Create statement
		Statement statement = connection.createStatement();
		
		// Execute statement
		ResultSet resultSet = statement.executeQuery("select * from book");
		
		// Iterate through the result and print
		while(resultSet.next()) {
			BookList book = new BookList();
			book.setBookID(resultSet.getInt(1));
			book.setISBN(resultSet.getString(2));
			book.setAuthorName(resultSet.getString(3));
			book.setYear(resultSet.getInt(4));
			book.setPublisher(resultSet.getString(5));
			book.setTitle(resultSet.getString(6));
			book.setPrice(resultSet.getDouble(7));
			
			booksList.add(book);
		}
		
		return booksList;
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
