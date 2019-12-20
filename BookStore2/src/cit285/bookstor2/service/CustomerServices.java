package cit285.bookstor2.service;

import java.sql.SQLException;
import java.util.ArrayList;

import cit285.bookstore2.dao.*;
import cit285.bookstore2.domain.BookList;
import cit285.bookstore2.domain.Cart;
import cit285.bookstore2.domain.LoginCustomer;
import cit285.bookstore2.domain.*;




public class CustomerServices implements CustomerServicesAPI{
	CustomerDao customerDao;
	
	public CustomerServices() {
		customerDao = new CustomerDao();
	}
	
	// Get a student given student id
	
	// Get course id given course id
	public BookList getBook(int bookID){
		BookList book = null;
		
		try {
			book = customerDao.getBook(bookID);
			
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		return book;
	}
	
	// Get list of courses from the Dao
	public ArrayList<BookList> getBooks(){
		ArrayList<BookList> books = null;
		
		try {
			books = customerDao.getBooksList();
			
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		return books;
	}
	
	// Create a new Cart
	public Cart createCart() {
		return new Cart();
	}

	
	
	
}
